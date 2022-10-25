package com.jchz.leetcode.simple.$LCP0044_开幕式焰火;

import com.jchz.leetcode.structure.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 19:25
 */
public class Solution {
    public int numColor(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        dfs(root, set);

        return set.size();
    }

    void dfs(TreeNode root, Set<Integer> set) {
        if (root == null)
            return;

        set.add(root.val);

        dfs(root.left, set);
        dfs(root.right, set);
    }
}
