package com.jchz.leetcode.$0700_二叉搜索树中的搜索;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 16:56
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null) {
            if (root.val == val) {
                break;
            }
            else if (val > root.val) {
                root = root.right;
            }
            else {
                root = root.left;
            }
        }

        return root;
    }
}
