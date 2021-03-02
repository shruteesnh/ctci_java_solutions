package com.shrutee.arrays_and_string;


public class OneAway {

    /** Approach 1 : Check for the lengths, if both are equal then need to check for the replacement otherwise if the lengths differ by 1 then it can
     * be either one away delete or insert.
     *
     * Time Complexity - O(n) where n is the length of the shorter string
     * Space Complexity - O(1)
     *
     * @param s
     * @param t
     * @return boolean if the two strings are just one edit away
     */
    public static boolean oneEditAway(String s, String t){

        if(s == null || s.length() == 0 || t == null || t.length() == 0){
            return false;
        }

        if(s.length() == t.length()){
            return checkOneEditReplace(s,t);
        }
        if(s.length() - t.length() == 1){
            return checkOneEditDeleteInsert(s,t);
        }

        if(t.length() - s.length() == 1){
            return checkOneEditDeleteInsert(t,s);
        }
        return false;
    }

    public static boolean checkOneEditReplace(String s, String t){
        boolean flag = false;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                if(flag){
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }

    public static boolean checkOneEditDeleteInsert(String s, String t){
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) != t.charAt(j)){
                i++;

            }else{
                i++;
                j++;
            }
        }
        return j==t.length();
    }
}
