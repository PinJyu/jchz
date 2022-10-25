package com.jchz.leetcode.simple.$剑指OfferII0056_二叉搜索树中两个节点之和;

import com.jchz.leetcode.structure.TreeNode;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 19:29
 * @see
 * @since
 */
public class Solution {

    TreeNode r;
    public boolean findTarget(TreeNode root, int k) {
        r = root;
        return dfs(root, k);
    }

    TreeNode binarySearch(int x) {
        TreeNode ir = r;
        while (ir != null) {
            if (x > ir.val)
                ir = ir.right;
            else if (x < ir.val)
                ir = ir.left;
            else
                return ir;
        }

        return null;
    };

    private boolean dfs(TreeNode root, int k) {
        if (root == null)
            return false;

        TreeNode o = binarySearch(k - root.val);
        return o != null && o != root || dfs(root.left, k) || dfs(root.right, k);
    }

}
