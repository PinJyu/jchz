package com.jchz.leetcode.simple.$剑指Offer0032_II_从上到下打印二叉树II;

import com.jchz.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-18 10:47
 */
public class Solution {

    List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, -1);
        return ret;
    }

    void dfs(TreeNode root, int deep) {
        if (root == null) {
            return;
        }

        deep++;
        List<Integer> l;
        if (deep == ret.size()) {
            l = new ArrayList<>();
            ret.add(l);
        }
        else {
            l = ret.get(deep);
        }

        l.add(root.val);

        dfs(root.left, deep);
        dfs(root.right, deep);
    }

    public List<List<Integer>> levelOrder_1(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            ret.add(l);
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();

                l.add(poll.val);
                if (poll.left != null) {
                    q.offer(poll.left);
                }
                if (poll.right != null) {
                    q.offer(poll.right);
                }
            }
        }

        return ret;
    }
}
