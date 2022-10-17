package com.jchz.leetcode.simple.$2236_判断根结点是否等于子结点之和;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 16:24
 */
public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
