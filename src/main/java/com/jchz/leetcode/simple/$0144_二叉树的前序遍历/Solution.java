package com.jchz.leetcode.simple.$0144_二叉树的前序遍历;

import com.jchz.leetcode.structure.TreeNode;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 13:45
 */
public class Solution {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    // travel
    public List<Integer> preorderTraversal_1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> s = new LinkedList<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode tn = s.pop();
            res.add(tn.val);
            if (tn.right != null)
                s.push(tn.right);
            if (tn.left != null)
                s.push(tn.left);
        }

        return res;
    }

    // Morris
    public List<Integer> preorderTraversal_2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        TreeNode pre;

        while (root != null) {
            if (root.left != null) {
                res.add(root.val);
                pre = root.left;

                while (pre.right != null && pre.right != root) {
                    pre = pre.right;
                }

                if (pre.right != null) {
                    pre.right = null;
                }
                else {
                    pre.right = root;
                }
            }
            else {
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}
