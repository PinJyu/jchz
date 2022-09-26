package com.jchz.leetcode.$0653_两数之和IV输入二叉搜索树;

import com.jchz.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 15:53
 */
public class Solution {
    private Map<Integer, Integer> map = new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (k - entry.getKey() != entry.getKey() && map.containsKey(k - entry.getKey())) {
                return true;
            }
            else if (k - entry.getKey() == entry.getKey() && map.containsKey(k - entry.getKey()) && 1 == map.get(k - entry.getKey())) {
                return true;
            }
        }


        return false;
    }

    private void dfs(TreeNode root) {
        if (root == null) return ;
        dfs(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        dfs(root.right);
    }

//    private boolean binarySearch(TreeNode root, int t) {
//        while (root != null) {
//            if (t == root.val) {
//                return true;
//            }
//            else if (t < root.val) {
//                root = root.left;
//            }
//            else {
//                root = root.right;
//            }
//        }
//
//        return false;
//    }
}
