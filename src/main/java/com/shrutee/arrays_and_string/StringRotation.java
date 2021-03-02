package com.shrutee.arrays_and_string;

public class StringRotation {

    /** Time complexity - O(n)
     *
     * @param s1
     * @param s2
     * @return true if s2 is a rotation of s1 using only one call to isSubstring
     */
    public static boolean isStringRotated(String s1, String s2){

        if(s1 == null || s1.length() == 0 || s2 == null || s2.length()==0 || s1.length() != s2.length()){
            return false;
        }

        //"waterbottle"
        //"erbottlewaterbottlewat"

        StringBuilder s = new StringBuilder(s2);
        s.append(s2);

        return isSubstring(s.toString(),s1);
    }

    public static boolean isSubstring(String s, String t){
        return true;
    }
}
