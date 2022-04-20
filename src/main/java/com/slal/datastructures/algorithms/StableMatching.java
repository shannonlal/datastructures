package com.slal.datastructures.algorithms;

import com.slal.datastructures.sorting.InsertionSort;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 *
 * Giving:
 * 1. A student matrix that has a list of students and their preferred medical schools
 * 2. A medical school matrix that has a list of students and their preferred medical schools
 *
 * Initialization:
 * i. Need to get a matching lookup for medical schools to students (HashMap)
 * ii. Need a helper matrix for student ranking.  This will help with searching students ranking compared to schools
 * iii. Need a list of Free Students.  A student who is matched could become unmatched
 *
 * Process:
 * Repeat:
 *  1. Get the students prefered medical schools
 *  2. In prefered order of the school check to see if the medical school is matched.
 *  3. Check if a match is possible
 *  4. Keep processing until student has matched to a school
 */
public class StableMatching {
    private static final Logger LOGGER = Logger.getLogger( StableMatching.class.getName() );

    private HashMap<Integer, Integer> matchedSchools;
    private Object[][] studentsPlacements;
    private int[][] studentRanking;
    private int numberOfPlaces=0;
    private int freeStudents = 0;

    private void initializeMatching(int[][] studentPref, int[][] schoolPref){
        this.numberOfPlaces = schoolPref.length;
        this.freeStudents = studentPref.length;
        this.matchedSchools = new HashMap<Integer, Integer>(this.numberOfPlaces);
        this.studentsPlacements = new Object[2][this.freeStudents];
        this.studentRanking = new int[this.freeStudents][this.freeStudents];

        for( int i=0; i< this.numberOfPlaces; i++) {
            this.matchedSchools.put(i, null);
            this.studentsPlacements[0][i]= true;
            this.studentsPlacements[1][i] = 0;
            int rank = 0;
            for(int j=0; j<this.numberOfPlaces; j++) {
                int student = schoolPref[i][j];
                this.studentRanking[i][student]=rank;
                rank++;
            }
        }


    }

    private boolean match(int studentId, int selectedMedSchoolId){

        //if the best preference medical school 'm' has no student enrolled: 's1' and 'm' match
        if(this.matchedSchools.get(selectedMedSchoolId)==null) {
            this.matchedSchools.replace(selectedMedSchoolId, studentId);
            this.studentsPlacements[0][studentId]=false;
            this.studentsPlacements[1][studentId]=(int)this.studentsPlacements[1][studentId]+1;
            this.freeStudents--;
            //To Track Progress Uncomment:
            //Remove Star to Uncomment
            LOGGER.info("Student " +studentId +" got enrolled in Medical School " + selectedMedSchoolId);
            //*/
        }else {
            int studentId2 = this.matchedSchools.get(selectedMedSchoolId);
            //if medical school prefers 's1' over 's2'(current student): 'm' and 's1' match
            //UPDATE: USING THIS WILL CAUSE O(N^3)
            //if(medPrefers(m, medschools_pref, s1,s2))
            //O(1): Using men_ranking that is constructed before in O(n^2)
            if(this.studentRanking[selectedMedSchoolId][studentId]<this.studentRanking[selectedMedSchoolId][studentId2]) {
                this.matchedSchools.replace(selectedMedSchoolId, studentId);
                this.studentsPlacements[0][studentId]=false;
                this.studentsPlacements[0][studentId2]=true;
                this.studentsPlacements[1][studentId]=(int)this.studentsPlacements[1][studentId]+1;
                //To Track Progress Uncomment:
                //Remove Star to Uncomment
                LOGGER.info("Medical School"+selectedMedSchoolId+" removed  " + "Student" +studentId2);
                LOGGER.info("Medical School"+selectedMedSchoolId+" enrolled " + "Student" +studentId);
                //*/
            }
            //else the medical school prefers their current student: 's1' tries the next medical school on their list
            else
                this.studentsPlacements[1][studentId]=(int)this.studentsPlacements[1][studentId]+1;
        }

        return false;
    }

    /**
     *
     * @param studentPref
     * @param medicalPref
     * @return
     */
    public HashMap<Integer, Integer> findStableMatches( int[][] studentPref, int [][] medicalPref){
        initializeMatching( studentPref, medicalPref);

        while( this.freeStudents > 0){

            //Need to go back to beginning each time as you
            int studentId = 0;
            while((boolean)this.studentsPlacements[0][studentId]!=true)
                studentId++;

            for( int medSchoolIndex = (int)this.studentsPlacements[1][studentId]; medSchoolIndex<medicalPref.length && (boolean)this.studentsPlacements[0][studentId]==true;medSchoolIndex++ ){
                int selectedMedSchoolId = studentPref[studentId][medSchoolIndex];
                this.match(studentId,selectedMedSchoolId );
            }
            /*//For this student get the preferred medical school
            int preferredMedicalSchoolId = 0;
            //Attempt to match
            if( this.match( studentId, preferredMedicalSchoolId)){
                studentId++;
                this.freeStudents--;
            }*/
        }
        return this.matchedSchools;
    }
}


