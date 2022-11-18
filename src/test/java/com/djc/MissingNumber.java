package com.djc;

/**
 * @author djc
 * @version 1.0 2022/11/4 2:02
 * @Description TODO
 */
public class MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int xor = 0;
            int n = nums.length + 1;
            for (int i = 0; i < n - 1; i++) {
                xor ^= nums[i];
            }
            for (int i = 0; i <= n - 1; i++) {
                xor ^= i;
            }
            return xor;
        }
    }
}
