package com.djc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author djc
 * @version 1.0 2022/11/15 1:59
 * @Description TODO
 */
public class LevelOrder2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            LinkedList<TreeNode> memoryTreeNodes = new LinkedList<>();
            ArrayList<List<Integer>> result = new ArrayList<>();
            if (root!=null)
                memoryTreeNodes.add(root);
            while (!memoryTreeNodes.isEmpty()) {
                List<Integer> currentLine = new LinkedList<>();
                for (int i = memoryTreeNodes.size(); i > 0; --i) {
                    TreeNode topTreeNode = memoryTreeNodes.poll();
                    if (topTreeNode.left != null)
                        memoryTreeNodes.add(topTreeNode.left);
                    if (topTreeNode.right != null)
                        memoryTreeNodes.add(topTreeNode.right);
                    currentLine.add(topTreeNode.val);
                }
                result.add(currentLine);
            }
            return result;
        }
    }
}
