package com.jchz.leetcode.simple.$2331_计算布尔二叉树的值;

import com.jchz.leetcode.structure.TreeNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 22:49
 * @see
 * @since
 */
public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null || root.right == null)
            return root.val == 1;

        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);

        if (root.val == 2) {
            return l || r;
        }
        else
            return l && r;
    }

}
