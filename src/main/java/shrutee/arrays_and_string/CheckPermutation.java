package com.shrutee.arrays_and_string;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given 2 strings, decide if one is permutation of the other
 *
 *  The two strings are permutation of each other if
 *  1. they have the same length
 *  2. Each character of one string appears in the other in any order
 */
public class CheckPermutation {

    /** Approach 1 - Use an int array to count the occurences depending on ASCII or EXtentde ASCII
     * Space complexity - O(1) as we are creating a map
     * Time complexity - O(n)
     *
     * @param s
     * @param t
     * @return boolean if they are permutation of each other
     */
    public static boolean isPermutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] counts = new int[128];
        for(int i =0;i<s.length();i++){
            counts[s.charAt(i)]++;
        }

        for(int i = 0;i<t.length();i++){
            counts[t.charAt(i)]--;
            if(counts[t.charAt(i)] < 0){
                return false;
            }
        }

        /*for(int c:counts){
            if(c != 0){
                return false;
            }
        }*/

        return true;
    }

    /** Approach 2 - Using a map of chanracters and counts
     * Space complexity - O(n) as we are creating a map
     * Time complexity - O(n)
     *
     * @param s
     * @param t
     * @return boolean if they are permutation of each other
     */
    public static boolean isPermutation1(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> freqMap = new HashMap();

        for(int i =0;i<s.length();i++){
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i =0;i<t.length();i++){
            freqMap.put(t.charAt(i), freqMap.getOrDefault(t.charAt(i),0)-1);
            if(freqMap.get(t.charAt(i)) == 0){
                freqMap.remove(t.charAt(i));
            }
        }

        return freqMap.size() == 0;

    }

    /** Approach 3 - Sort the 2 strings and check if they are equal
     * Space complexity - O(1)
     * Time complexity - O(nlogn)
     *
     * @param s
     * @param t
     * @return boolean if they are permutation of each other
     */
    public static boolean isPermutation2(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        if(Arrays.equals(sArray,tArray)){
            return true;
        }
      return false;
    }
}
