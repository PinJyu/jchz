package com.jchz.leetcode.structure;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 10:57
 */
public class TreeNode     {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
