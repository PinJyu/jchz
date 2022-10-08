package com.jchz.leetcode.simple.$0501_二叉搜索树中的众数;

import com.jchz.leetcode.structure.TreeNode;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 10:27
 */
public class Solution {
    private Set<Integer> ans = new HashSet<>();
    private int base, count, maxCount;

    private void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        update(root);
        dfs(root.right);
    }

    // morris 中序
    public int[] findMode_1(TreeNode root) {

        TreeNode pre = null;
        while (root != null) {
            pre = root.left;
            if (root.left != null) {
                while (pre.right != null && pre.right != root) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = root;
                    root = root.left;
                }
                else {
                    update(root);
                    root = root.right;
                    pre.right = null;
                }
            }
            else {
                update(root);
                root = root.right;
            }
        }

        int[] res = new int[ans.size()];
        int i = 0;
        for (Integer a : ans) {
            res[i++] = a;
        }

        return res;
    }
    private void update(TreeNode root) {
        if (root.val == base) {
            count++;
        }
        else {
            base = root.val;
            count = 1;
        }

        if (count > maxCount) {
            ans.clear();
            ans.add(root.val);
            maxCount = count;
        }
        else if (count == maxCount) {
            ans.add(root.val);
        }

    }



    public int[] findMode(TreeNode root) {
        dfs(root);

        int[] res = new int[ans.size()];
        int i = 0;
        for (Integer a : ans) {
            res[i++] = a;
        }

        return res;
    }




}
