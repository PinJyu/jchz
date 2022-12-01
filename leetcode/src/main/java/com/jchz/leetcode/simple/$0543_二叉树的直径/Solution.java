package com.jchz.leetcode.simple.$0543_二叉树的直径;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 18:27
 */
public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    private int max = -1;
    private int dfs(TreeNode root) {
        if (root == null) return 0;

        int ld = dfs(root.left);
        int rd = dfs(root.right);

        max = Math.max(ld + rd, max);

        return Math.max(ld, rd) + 1;

    }
}
