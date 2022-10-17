package com.jchz.leetcode.simple.$剑指Offer0028_对称的二叉树;

import com.jchz.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-17 19:57
 * @see
 * @since
 */
public class Solution {

    public boolean isSymmetric_1(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode u = q.poll(), v = q.poll();
            if (u == null && v == null)
                continue;
            if (u == null || v == null)
                return false;

            if (u.val != v.val)
                return false;

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }

        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }


    boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        return root1.val == root2.val && check(root1.left, root2.right) && check(root1.right, root2.left);

    }

}
