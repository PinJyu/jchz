package com.jchz.leetcode.$0145_二叉树的后序遍历;

import com.jchz.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 14:50
 */
public class Solution {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        dfs(root.right);

        res.add(root.val);
    }

    public List<Integer> postorderTraversal_1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Deque<TreeNode> s = new LinkedList<>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode cur = s.pop();
            while (cur.left != null) {
                s.push(cur);
                cur = cur.left;
            }

            res.add(cur.val);
            if (cur.right != null)
                s.push(cur.right);
            if (cur.left != null)
                s.push(cur.left);
        }

        return res;
    }
}
