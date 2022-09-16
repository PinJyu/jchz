package com.jchz.leetcode.$0257_二叉树的所有路径;

import com.jchz.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-15 17:47
 */
public class Solution {


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;

        List<String> ls = binaryTreePaths(root.left);
        List<String> rs = binaryTreePaths(root.right);

        if (ls.isEmpty() && rs.isEmpty()) {
            res.add(root.val + "");
        }
        else {
            for (String l : ls) {
                res.add(root.val + "->" + l);
            }
            for (String r : rs) {
                res.add(root.val + "->" + r);
            }

        }
        return res;
    }

    public List<String> binaryTreePaths_1(TreeNode root) {
        dfs(root, "");

        return res;
    }
    private List<String> res = new ArrayList<>();
    private void dfs(TreeNode root, String parentRoute) {
        if (root == null) {
            return;
        }

        String route;
        if ("".equals(parentRoute))
            route = parentRoute + root.val;
        else {
            route = parentRoute + "->" + root.val;
        }
        if (root.left == null && root.right == null) {
            res.add(route);
        }

        dfs(root.left, route);
        dfs(root.right, route);

    }


}
