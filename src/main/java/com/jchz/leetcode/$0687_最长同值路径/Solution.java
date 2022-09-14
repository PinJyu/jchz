package com.jchz.leetcode.$0687_最长同值路径;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-02 12:03
 */
public class Solution {

    private Map<TreeNode, Integer> map = new HashMap<>();

    private int maxCount = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return maxCount;
    }

    // LEFT/RIGHT/ROOT, ROOT's route = LEFT's route + RIGHT's route
    public int dfs(TreeNode cur) {
        if (cur == null) return 0;

        int left = dfs(cur.left);
        int right = dfs(cur.right);

        int count = 0, left1 = 0, right1 = 0;
        if (cur.left != null && cur.left.val == cur.val)
            left1 = left + 1;
        if (cur.right != null && cur.right.val == cur.val)
            right1 = right + 1;

        count = left1 + right1;
        if (maxCount < count)
            maxCount = count;
        return Math.max(left1, right1); // 返回左右中最大的
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
