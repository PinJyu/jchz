package com.jchz.leetcode.$0637_二叉树的层平均值;

import com.jchz.leetcode.structure.TreeNode;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 13:05
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            double sum = 0;
            final int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;

                if (cur.left != null)
                    q.offer(cur.left);

                if (cur.right != null)
                    q.offer(cur.right);
            }

            res.add(sum / size);

        }

        return res;
    }
}
