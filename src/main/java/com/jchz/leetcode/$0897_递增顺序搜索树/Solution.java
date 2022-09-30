package com.jchz.leetcode.$0897_递增顺序搜索树;

import com.jchz.leetcode.structure.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 17:46
 */
public class Solution {


    List<TreeNode> l = new LinkedList<>();
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode head = null, tail = null;
        for (TreeNode treeNode : l) {
            treeNode.left = null;
            if (head == null) {
                head = treeNode;
                tail = treeNode;
            }
            else {
                tail.right = treeNode;
                tail = tail.right;
            }
        }
        return head;
    };

    void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);

        l.add(root);
        dfs(root.right);
    }
}

