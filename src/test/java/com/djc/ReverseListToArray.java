package com.djc;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author djc
 * @version 1.0 2022/10/27 21:04
 * @Description TODO
 */
public class ReverseListToArray {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            Deque<Integer> intStack = new ArrayDeque<>();
            ListNode temp = head;
            while (temp != null) {
                intStack.push(temp.val);
                temp = temp.next;
            }
            int[] result = new int[intStack.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = intStack.pop();
            }
            return result;
        }
    }
}
