package com.djc;

/**
 * @author djc
 * @version 1.0 2022/10/28 4:13
 * @Description TODO
 */
public class ReverseList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode result = null;
            ListNode remain = head;
            while (remain != null) {
                ListNode temp = remain.next;
                remain.next = result;
                result = remain;
                remain = temp;
            }
            return result;
        }
    }
}
