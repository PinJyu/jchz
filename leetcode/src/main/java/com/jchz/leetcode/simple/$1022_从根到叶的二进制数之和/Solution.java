package com.jchz.leetcode.simple.$1022_从根到叶的二进制数之和;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 20:07
 */
public class Solution {
    public int sumRootToLeaf(TreeNode root) {

       return dfs(root, 0);
    }

    int dfs(TreeNode root, int pVal) {
        if (root == null)
            return pVal;

        pVal <<= 1;
        pVal += root.val;

        if (root.left == null)
            return dfs(root.right, pVal);
        else if (root.right == null)
            return dfs(root.left, pVal);
        else if (root.left == null && root.right == null)
            return pVal;
        else
            return dfs(root.left, pVal) + dfs(root.right, pVal);
    }
}
