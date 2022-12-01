package com.jchz.leetcode.simple.$剑指Offer0054_二叉搜索树的第k大节点;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-19 18:04
 */
public class Solution {
    int k;
    int ret;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;

        dfs(root);

        return ret;
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.right);

        k--;
        if (k == 0) {
            ret = root.val;
            return;
        }

        dfs(root.left);
    }

}
