package com.djc;

/**
 * @author djc
 * @version 1.0 2022/11/4 13:04
 * @Description TODO
 */
public class MinArray {
    //MySolution
//    class Solution {
//        public int minArray(int[] numbers) {
//            int start = numbers[0];
//            int length = numbers.length;
//            for (int i = 0; i < length - 1; ++i) {
//                if (numbers[i] > numbers[i + 1]) {
//                    start = numbers[i + 1];
//                }
//            }
//            return start;
//        }
//    }
    class Solution {
        public int minArray(int[] numbers) {
            int low = 0;
            int high = numbers.length - 1;
            while (low < high) {
                int pivot = low + (high - low) / 2;
                if (numbers[pivot] < numbers[high]) {
                    high = pivot;
                } else if (numbers[pivot] > numbers[high]) {
                    low = pivot + 1;
                } else {
                    high -= 1;
                }
            }
            return numbers[low];
        }
    }
}
