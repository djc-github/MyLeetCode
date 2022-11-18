package com.djc;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author djc
 * @version 1.0 2022/11/13 22:52
 * @Description TODO
 */
public class LevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

        class Solution {
        public int[] levelOrder(TreeNode root) {
            if (root==null){
                return new int[0];
            }
            LinkedList<TreeNode> tempQueue=new LinkedList<>();
            ArrayList<Integer> resultList = new ArrayList<>();
            tempQueue.add(root);
            while (!tempQueue.isEmpty()){
                TreeNode tempNode=tempQueue.poll();
                resultList.add(tempNode.val);
                if (tempNode.left!=null){
                    tempQueue.add(tempNode.left);
                }
                if (tempNode.right!=null){
                    tempQueue.add(tempNode.right);
                }
            }
            int[] result=new int[resultList.size()];
            for (int i=0;i<resultList.size();++i){
                result[i]=resultList.get(i);
            }
            return result;
        }
    }
//    class Solution {
//        public int[] levelOrder(TreeNode root) {
//            if (root == null) return new int[0];
//            Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
//                add(root);
//            }};
//            ArrayList<Integer> ans = new ArrayList<>();
//            while (!queue.isEmpty()) {
//                TreeNode node = queue.poll();
//                ans.add(node.val);
//                if (node.left != null) queue.add(node.left);
//                if (node.right != null) queue.add(node.right);
//            }
//            int[] res = new int[ans.size()];
//            for (int i = 0; i < ans.size(); i++)
//                res[i] = ans.get(i);
//            return res;
//        }
//    }
}
