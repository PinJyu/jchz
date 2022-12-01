package com.jchz.leetcode.simple.$面试题04_04_检查平衡性;

import com.jchz.leetcode.structure.TreeNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 17:55
 * @see
 * @since
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int ld = dfs(root.left);
        int rd = dfs(root.right);
        if (ld == -1 || rd == -1)
            return -1;
        if (Math.abs(ld - rd) > 1)
            return -1;

        return Math.max(ld, rd) + 1;
    }
}
