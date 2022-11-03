package com.djc;

/**
 * @author djc
 * @version 1.0 2022/11/3 16:45
 * @Description TODO
 */
public class ReplaceSpace {
    class Solution {
        public String replaceSpace(String s) {
            StringBuffer resultString = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c==' '){
                    resultString.append("%20");
                }else {
                    resultString.append(c);
                }
            }
            return resultString.toString();
        }
    }
}
