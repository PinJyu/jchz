package com.jchz.leetcode.simple.$0530_二叉搜索树的最小绝对差;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 17:10
 */
public class Solution {

    private int lastValue = -1, minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {

        if (root == null) return Integer.MAX_VALUE;


        int leftTreeMinDiff = getMinimumDifference(root.left);

        if (lastValue == -1)
            lastValue = root.val;
        else {
            minDiff = Math.min(Math.abs(root.val - lastValue), minDiff);
            lastValue = root.val;
        }

        int rightTreeMinDiff = getMinimumDifference(root.right);

        return minDiff;
    }

    // Morris
    public int getMinimumDifference_1(TreeNode root) {
        TreeNode pre;

        int lastValue = -1, minDiff = Integer.MAX_VALUE;
        while (root != null) {
            if ((pre = root.left) != null) {
                while(pre.right != null && pre.right != root) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = root;
                    root = root.left;
                }
                else {
                    if (lastValue == -1)
                        lastValue = root.val;
                    else {
                        minDiff = Math.min(Math.abs(root.val - lastValue), minDiff);
                        lastValue = root.val;
                    }
                    pre.right = null;
                    root = root.right;
                }
            }
            else {
                if (lastValue == -1)
                    lastValue = root.val;
                else {
                    minDiff = Math.min(Math.abs(root.val - lastValue), minDiff);
                    lastValue = root.val;
                }
                root = root.right;
            }
        }

        return minDiff;
    }
}
