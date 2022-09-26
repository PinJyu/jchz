package com.jchz.leetcode.$0617_合并二叉树;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 10:48
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        TreeNode newTreeNode;
        if (root1 == null) {
            newTreeNode = new TreeNode(root2.val);
            newTreeNode.left = mergeTrees(null, root2.left);
            newTreeNode.right = mergeTrees(null, root2.right);
        }
        else if (root2 == null) {
            newTreeNode = new TreeNode(root1.val);
            newTreeNode.left = mergeTrees(null, root1.left);
            newTreeNode.right = mergeTrees(null, root1.right);
        }
        else {
            newTreeNode = new TreeNode(root1.val + root2.val);
            newTreeNode.left = mergeTrees(root2.left, root1.left);
            newTreeNode.right = mergeTrees(root2.right, root1.right);
        }

        return newTreeNode;
    }
}
