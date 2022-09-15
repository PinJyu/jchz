package com.jchz.leetcode.$0226_翻转二叉树;

import com.jchz.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 17:14
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public TreeNode invertTree_1(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode c = null;
        while (!q.isEmpty()) {
            c = q.poll();
            if (c.left != null)
                q.offer(c.left);
            if (c.right != null)
                q.offer(c.right);
            swapChild(c);
        }

        return root;
    }


    private void swapChild(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
