package com.djc;

/**
 * @author djc
 * @version 1.0 2022/11/3 17:00
 * @Description TODO
 */
public class ReverseLeftWords {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            if (s.isEmpty()||s==null) {
                return s;
            }
            String lefts = s.substring(0, n);
            String rights = s.substring(n);
            return rights + lefts;
        }
    }
}
