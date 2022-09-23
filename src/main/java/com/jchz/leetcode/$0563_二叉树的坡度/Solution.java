package com.jchz.leetcode.$0563_二叉树的坡度;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 12:56
 */
public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        new Solution().findTilt(root);

    }
    private int sum = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int sl = dfs(root.left);
        int sr = dfs(root.right);

        sum += Math.abs(sl - sr);
        return root.val + sl +  sr;
    }

}
