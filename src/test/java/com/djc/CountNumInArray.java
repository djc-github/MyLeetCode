package com.djc;

/**
 * @author djc
 * @version 1.0 2022/11/4 0:54
 * @Description TODO
 */
public class CountNumInArray {
    class Solution {
        public int search(int[] nums, int target) {
            return helper(nums, target) - helper(nums, target - 1);
        }
        int helper(int[] nums, int tar) {
            int i = 0, j = nums.length - 1;
            while(i <= j) {
                int m = (i + j) / 2;
                if(nums[m] <= tar) i = m + 1;
                else j = m - 1;
            }
            return i;
        }
    }

}
