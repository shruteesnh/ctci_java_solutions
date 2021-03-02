package com.shrutee.arrays_and_string;

public class URLify {

    /**
     * Approach 1 : This assumes that the string has excat number of characters to hold all the characters including %20.
     * TIme Complexity - O(n)
     * Space complexity - O(1)
     *
     * @param str
     * @param k
     * @return
     */

    public static String urlify(String str, int k){

        if(str == null || str.length() == 0){
            return "";
        }
        char[] cArr = str.toCharArray();

        int j = k-1;
        int n = str.length()-1;

        while(n>=0 && j >= 0){

            if(cArr[j] == ' '){
                cArr[n--] = '0';
                cArr[n--] = '2';
                cArr[n--] = '%';
            }else{
                cArr[n--] = cArr[j];
            }
            j--;
        }

        return new String(cArr);
    }
}
