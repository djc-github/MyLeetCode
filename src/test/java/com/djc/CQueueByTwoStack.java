package com.djc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author djc
 * @version 1.0 2022/10/27 13:38
 * @Description TODO
 */
public class CQueueByTwoStack {
    class CQueue {
        Deque<Integer> inStack;
        Deque<Integer> outStack;

        public CQueue() {
            inStack = new ArrayDeque<Integer>();
            outStack = new ArrayDeque<Integer>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            if (outStack.isEmpty()) {
                if (inStack.isEmpty()) {
                    return -1;
                }
                in2out();
            }
            return outStack.pop();
        }

        private void in2out() {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
