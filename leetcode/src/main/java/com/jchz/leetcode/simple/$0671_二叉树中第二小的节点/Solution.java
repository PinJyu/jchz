package com.jchz.leetcode.simple.$0671_二叉树中第二小的节点;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 17:39
 */
public class Solution {
    private int min;
    private Integer second = null;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        min = root.val;

        dfs(root);
        return second == null ? -1 : second;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.val > min && (second == null || root.val < second)) {
            second = root.val;
            return;
        }

        if (root.left != null) {
            dfs(root.left);
            dfs(root.right);
        }


    }
}
