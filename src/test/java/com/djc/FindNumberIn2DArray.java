package com.djc;

/**
 * @author djc
 * @version 1.0 2022/11/4 2:03
 * @Description TODO
 */
public class FindNumberIn2DArray {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int i = matrix.length - 1, j = 0;
            while(i >= 0 && j < matrix[0].length)
            {
                if(matrix[i][j] > target) i--;
                else if(matrix[i][j] < target) j++;
                else return true;
            }
            return false;
        }
    }

}
