package com.jchz.leetcode.simple.$剑指Offer0068_I_二叉搜索树的最近公共祖先;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 17:31
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            else
                break;
        }

        return root;
    }

    // 以下不正常
    TreeNode ret;
    public TreeNode lowestCommonAncestor_1(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ret;
    }

    boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return false;

        boolean tl = dfs(root.left, p, q);
        boolean tr = dfs(root.right, p, q);

        if (ret == null && (tl && tr) || ((tl || tr) && (root.val == p.val || root.val == q.val)))
            ret = root;

        return tl || tr || root.val == p.val || root.val == q.val;
    }
//    int contain(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null)
//            return 0;
//
//        int map = 0;
//        if (root.val == p.val)
//            map |= 1 ;
//        if (root.val == q.val)
//            map |= 2;
//        map |= contain(root.left, p, q);
//        map |= contain(root.right, p, q);
//
//        return map;
//    }
//
//
//    void dfs(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null || ret != null)
//            return;
//
//        dfs(root.left, p, q);
//        dfs(root.right, p, q);
//        if (ret == null && 3 == contain(root, p, q))
//            ret = root;
//    }
//
}
