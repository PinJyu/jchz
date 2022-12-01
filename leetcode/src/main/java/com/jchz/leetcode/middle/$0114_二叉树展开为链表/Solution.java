package com.jchz.leetcode.middle.$0114_二叉树展开为链表;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 17:06
 */
public class Solution {
    public void flatten(TreeNode root) {
        dfs(root);
    }

    TreeNode dfs(TreeNode root) {
        if (root == null)
            return null;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null) {
            return root;
        }

        TreeNode l = dfs(root.left);
        TreeNode r = dfs(root.right);

        if (left != null) {
            root.right = left;
            if (l != null)
                l.right = right;
            root.left = null;
        }

        if (r == null) {
            r = l;
        }
        return r;
    }
}
