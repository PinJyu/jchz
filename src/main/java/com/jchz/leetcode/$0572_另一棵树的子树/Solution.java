package com.jchz.leetcode.$0572_另一棵树的子树;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 13:20
 */
public class Solution {
    private boolean same = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;

        else if (root == null || subRoot == null) return false;

        if (root.val == subRoot.val) {
            same = true;
            if (!(isSubtree(root.left, subRoot.left) && isSubtree(root.right, subRoot.right))) {
                same = false;
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot.right);
            }
            return true;
        }
        else {
            if (same) {
                same = false;
                return false;
            }
            else {
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            }
        }

    }
}
