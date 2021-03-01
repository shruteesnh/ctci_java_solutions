package com.shrutee.arrays_and_string;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

public class IsUnique {

    /** Approach 1 - Use boolean array to store the characters
     * Check for ASCII or Unicode. If Ascii there will be (2^7) 128 bits and for extended ASCII there will be (2^8) 256. For Unicode, it will be 2^16 - 65536 bits
     * Space complexty - O(1)
     * Time Complexity - O(1) as the loop cannot go beyond 128
     *
     * @param str
     * @return
     */

    public static boolean isUnique(String str){

        //if the string contains more than 128 characters, cant be unique
        if(str.length() > 128){
            return false;
        }

        boolean[] bool = new boolean[128];

        for(int i =0;i<str.length() ;i++){
            if(bool[str.charAt(i)]){
                return false;
            }

            bool[str.charAt(i)] = true;
        }

        return true;
    }


    public static boolean isUnique1(String str){

        //Create a set to contains all the characters
        //O(n) space complexity because of that
        Set<Character> hs = new HashSet();
        char[] chars = str.toCharArray();


        //Looping through all the characters so the time complexity will be O(n)
        for(char c : chars){
            if(hs.contains(c)){
                return false;
            }else{
                hs.add(c);
            }
        }
        return true;
    }

    public static boolean isUniqueFollowUp(String str){
        //Since we cannot use any data structure, we have to loop through the string twice to check for any
        // repeating character so the time complexity will be O(n^2), space complexity will be O(1)
        for(int i =0;i<str.length()-1;i++){
            for(int j = i+1; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }
}
