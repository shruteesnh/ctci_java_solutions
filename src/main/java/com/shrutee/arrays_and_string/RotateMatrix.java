package com.shrutee.arrays_and_string;

public class RotateMatrix {

    /** Approach 1 : Create second array to store the integers
     * Time Complexity - O(n^2)
     * Space Complexity - O(n^2)
     * @param matrix
     */

    public static void rotateMatrix(int[][] matrix){

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] res = new int[r][c];

        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j] = matrix[c-j-1][i];
            }
        }

    }

    /** Approach 2 : In place
     * Time Complexity  - O(n^2)
     * Space Complexity - O(1)
     *
     * @param matrix
     */

    public static void rotateMatrixInPlace(int[][] matrix){

       int n = matrix.length;

       for(int i =0;i<n;i++){
           int last = n-1-i;
           for(int j =i; j<last;j++){
               int offset = j-i;
               int top = matrix[i][j];

               matrix[i][j] = matrix[last-offset][i];
               matrix[last-offset][i] = matrix[last][last-offset];
               matrix[last][last-offset] = matrix[j][last];
               matrix[j][last] = top;
           }
       }

    }

    public static void main(String[] args) {
        int[][] m1 = new int[3][3];

        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                m1[i][j] = i+2+j;
            }
        }


        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===================");

        rotateMatrix(m1);

        System.out.println("======================");

        rotateMatrixInPlace(m1);
    }
}
