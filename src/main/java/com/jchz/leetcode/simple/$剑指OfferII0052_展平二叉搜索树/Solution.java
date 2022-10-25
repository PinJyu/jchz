package com.jchz.leetcode.simple.$剑指OfferII0052_展平二叉搜索树;

import com.jchz.leetcode.structure.TreeNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 19:16
 * @see
 * @since
 */
public class Solution {
    TreeNode head, tail;
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return head;
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        if (head == null) {
            head = root;
            tail = root;
        }
        else {
            tail.right = root;
            tail = tail.right;
        }

        root.left = null;

        dfs(root.right);
    }

}

