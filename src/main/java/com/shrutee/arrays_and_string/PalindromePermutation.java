package com.shrutee.arrays_and_string;

public class PalindromePermutation {

    /**
     *
     * @param str
     * @return true if the String is a permutation of a palindrome
     */

    public static boolean checkIfPalindromePermutation(String str){

        if(str == null || str.length() == 0){
            return false;
        }

        int[] counts = new int[26]; //considering lowercase alphabets

        for(int i =0;i<str.length();i++){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                continue;
            }
            char val = Character.toLowerCase(str.charAt(i));
            counts[val-'a']++;

        }

        boolean flag = false;
        for(int i :counts){
            if(flag && i%2 != 0){
                flag = true;
            }
            if(flag && i%2 != 0){
               return false;
            }
        }
        return true;

    }
}
