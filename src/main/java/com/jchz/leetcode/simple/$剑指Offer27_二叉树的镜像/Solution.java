package com.jchz.leetcode.simple.$剑指Offer27_二叉树的镜像;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 18:36
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }
}
