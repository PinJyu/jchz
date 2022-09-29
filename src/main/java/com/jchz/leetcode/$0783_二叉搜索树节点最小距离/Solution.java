package com.jchz.leetcode.$0783_二叉搜索树节点最小距离;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 18:22
 */
public class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Integer lastNumber = null;

    public int minDiffInBST(TreeNode root) {
        dfs(root);

        return minDiff;
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        if (lastNumber == null) {
            lastNumber = root.val;
        }
        else {
            int diff = root.val - lastNumber;
            lastNumber = root.val;
            minDiff = Math.min(minDiff, diff);
        }

        dfs(root.right);
    }
}
