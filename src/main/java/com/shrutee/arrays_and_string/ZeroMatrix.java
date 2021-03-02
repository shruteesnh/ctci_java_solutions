package com.shrutee.arrays_and_string;

public class ZeroMatrix {

    /** Instaead of saving the zeroes in a matrix and having space complexity O(mn), we can save the zeroes in boolean matrices for rows and columns
     * TimeComplexity - O(mn)
     * Space Complexity = O(m + n)
     *
     * @param m1
     */
    public static void zeromatrix(int[][] m1){
        boolean[] rowZeroes = new boolean[m1.length];
        boolean[] colZeroes = new boolean[m1[0].length];

        for(int i =0;i<m1.length;i++){
            for(int j=0;j<m1[0].length;j++){
                if(m1[i][j] == 0){
                    rowZeroes[i] = true;
                    colZeroes[j] = true;
                }
            }
        }

        for(int i =0;i<m1.length;i++){
            if(rowZeroes[i]){
                nullifyColumns(m1, i);
            }
        }

        for(int i =0;i<m1[0].length;i++){
            if(colZeroes[i]){
                nullifyRows(m1, i);
            }
        }

    }

    public static void nullifyColumns(int[][] m, int col){
        for(int j = 0;j<m.length;j++){
            m[j][col] = 0;
        }
    }

    public static void nullifyRows(int[][] m, int row){
        for(int j = 0;j<m[0].length;j++){
            m[row][j] = 0;
        }
    }



}
