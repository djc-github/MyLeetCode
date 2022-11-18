package com.djc;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author djc
 * @version 1.0 2022/11/11 1:21
 * @Description TODO
 */
public class FirstUniqChar {
    class Solution {
        public char firstUniqChar(String s) {
            Map<Character, Boolean> dic = new LinkedHashMap<>();
            char[] sc = s.toCharArray();
            for(char c : sc)
                dic.put(c, !dic.containsKey(c));
            for(Map.Entry<Character, Boolean> d : dic.entrySet()){
                if(d.getValue()) return d.getKey();
            }
            return ' ';
        }
    }
}
