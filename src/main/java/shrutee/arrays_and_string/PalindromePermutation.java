package com.shrutee.arrays_and_string;

public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println("Helo");
    }

    public static boolean checkIfPalindromePermutation(String str){

        if(str == null || str.length() == 0){
            return false;
        }

        int[] counts = new int[26]; //considering lowercase alphabets

        for(int i =0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                counts[Character.toLowerCase(str.charAt('i'))]
            }

        }


    }
}
