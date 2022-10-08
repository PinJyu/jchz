package com.jchz.leetcode.simple.$0872_叶子相似的树;

import com.jchz.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 15:09
 */
public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> series1 = new ArrayList<>();
        List<Integer> series2 = new ArrayList<>();

        travelLeaf(root1, series1);
        travelLeaf(root2, series2);
        if (series1.size() != series2.size()) {
            return false;
        }

        for (int i = 0; i < series1.size(); i++) {
            if (series1.get(i) != series2.get(i))
                return false;
        }

        return true;
    }

    public void travelLeaf(TreeNode root, List<Integer> l) {
        if (root == null) return;

        if (root.left == null && root.right == null)
            l.add(root.val);

        travelLeaf(root.left, l);
        travelLeaf(root.right, l);
    }
}
