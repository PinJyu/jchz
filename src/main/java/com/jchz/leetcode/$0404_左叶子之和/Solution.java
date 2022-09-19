package com.jchz.leetcode.$0404_左叶子之和;

import com.jchz.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 17:52
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left != null) {
                q.offer(cur.left);
                if (cur.left.left == null)
                    sum += cur.left.val;
            }
            if (cur.right!= null) {
                q.offer(cur.right);
            }

        }

        return sum;


    }
}
