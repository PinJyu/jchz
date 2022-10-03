package com.jchz.leetcode.$0938_二叉搜索树的范围和;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 20:00
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        else if (root.val >= low && root.val <= high)
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

        else if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        else {
            return rangeSumBST(root.left, low, high);
        }

    }


}
