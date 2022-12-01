package com.jchz.leetcode.simple.$面试题17_12_BiNode;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 17:38
 */
public class Solution {
    TreeNode head = new TreeNode(-1), tail = head;
    public TreeNode convertBiNode(TreeNode root) {
        dfs(root);

        return head.right;
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        tail.right = root;
        tail = tail.right;
        root.left = null;
        dfs(root.right);
    }
}
