package com.shrutee.arrays_and_string;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    /** Approach 1 : Create a hashMap of the character an dthe count and use Stringbuilder to create the compresssed String
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     *
     * @param str
     * @return
     */
    public static String compressedString(String str){

        Map<Character, Integer> freqMap = new HashMap<>();
        for(int i =0;i<str.length();i++){
            freqMap.put(str.charAt(i), freqMap.getOrDefault(str.charAt(i),0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }

        return str.length() < sb.toString().length() ? str : sb.toString();
    }

    /** Approach 2 : Use Stringbuilder to create the compresssed String
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     *
     * @param str
     * @return
     */
    public static String compressedString1(String str){
       StringBuilder result = new StringBuilder();
       int count = 0;
       for(int i =0;i<str.length();i++){
           count++;
           if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
               result.append(str.charAt(i));
               result.append(count);
               count = 0;
           }
       }
        return str.length() < result.toString().length() ? str : result.toString();
    }
}
