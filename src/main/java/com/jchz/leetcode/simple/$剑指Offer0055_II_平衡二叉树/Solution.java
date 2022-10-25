package com.jchz.leetcode.simple.$剑指Offer0055_II_平衡二叉树;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 11:57
 */
public class Solution {
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return isBalanced;
    }


    int dfs(TreeNode root) {
        if (root == null || !isBalanced)
            return 0;

        int dl = dfs(root.left);
        int dr = dfs(root.right);

        if (Math.abs(dl - dr) > 1) {
            isBalanced = false;
        }


        return Math.max(dl, dr) + 1;
    }

}
