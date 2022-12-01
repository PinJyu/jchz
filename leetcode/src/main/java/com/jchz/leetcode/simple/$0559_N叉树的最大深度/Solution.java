package com.jchz.leetcode.simple.$0559_N叉树的最大深度;

import com.jchz.leetcode.structure.Node;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 11:53
 */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;

        int maxDepth = 1;
        if (root.children.size() > 0) {
            for (Node child : root.children) {
                maxDepth = Math.max(maxDepth(child) + 1, maxDepth);
            }
        }

        return maxDepth;
    }


}
