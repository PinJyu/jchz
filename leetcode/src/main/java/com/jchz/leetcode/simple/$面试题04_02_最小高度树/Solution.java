package com.jchz.leetcode.simple.$面试题04_02_最小高度树;

import com.jchz.leetcode.structure.TreeNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 17:45
 * @see
 * @since
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return toTree(nums, 0, nums.length - 1);
    }

    TreeNode toTree(int[] arr, int l, int r) {
        if (l == r)
            return new TreeNode(arr[l]);
        else if (l > r)
            return null;

        int m = (l + r) / 2;
        TreeNode root = new TreeNode(arr[m]);
        root.left = toTree(arr, l, m - 1);
        root.right = toTree(arr, m + 1, r);
        return root;
    }

}
