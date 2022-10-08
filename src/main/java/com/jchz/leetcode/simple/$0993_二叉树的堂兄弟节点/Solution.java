package com.jchz.leetcode.simple.$0993_二叉树的堂兄弟节点;

import com.jchz.leetcode.structure.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 15:23
 */
public class Solution {
    List<Integer> l = new ArrayList<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 1, x, y);
        int x_ = l.get(0), y_ = l.get(1);
        if (x_ / 2 == y_ / 2)
            return false;

        while (x_ > 1 && y_ > 1) {
            x_ /= 2;
            y_ /= 2;
        }

        return x_ == y_;
    }

    private void dfs(TreeNode root, int order, int x, int y) {
        if (root == null) return;
        if (l.size() == 2) return;

        if (root.val == x || root.val == y)
            l.add(order);

        dfs(root.left, order * 2, x, y);
        dfs(root.right, order * 2 + 1, x, y);
    }
}
