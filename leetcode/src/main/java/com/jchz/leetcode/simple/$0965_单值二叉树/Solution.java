package com.jchz.leetcode.simple.$0965_单值二叉树;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 21:30
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;


        return root.val == (root.left == null ? root.val : root.left.val) &&
                root.val == (root.right == null ? root.val : root.right.val) &&
                isUnivalTree(root.left) && isUnivalTree(root.right);

    }
}
