package com.slal.datastructures.algorithms.recursion;

/**
 * The following class will recursively reverse a string
 *
 * Any recursion algorithm needs a stop condition:
 * Stop condition:
 * i. Get to the end of the list.  Return the item
 * ii.  If not at end get next item
 */
public class ReverseString {

    private void reverse( char[] string, int currentIndex, char[] reversedString){
        if( currentIndex != string.length){
            reverse( string, currentIndex+1,reversedString);
            reversedString[string.length - (currentIndex+1)] = string[currentIndex];
            return;
        }
        return;
    }

    public String reverseString( String str ){

        if( str == null )
            return null;
        char[] reversedString = new char[str.length()];
        reverse( str.toCharArray(), 0,reversedString);

        return new String(reversedString);
    }
}
