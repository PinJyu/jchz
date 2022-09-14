package com.jchz.leetcode.$0652_寻找重复的子树;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-05 12:44
 */

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution_2 {

    public static void main(String[] args) {
        Integer[] j = {1,2,3,4,null,2,4,null,null,4};

        TreeNode root = null;
        Deque<TreeNode> treeNodes = new ArrayDeque<>();
        for (int i = 0; i < j.length; i++) {
            if (i == 0) {
                root = new TreeNode(j[0]);
                ++i;
                treeNodes.addFirst(root);
            }
            TreeNode treeNode = treeNodes.pollFirst();
            if (treeNode == null) break;
            if (i < j.length)
                treeNode.left = j[i] == null ? null : new TreeNode(j[i]);
            ++i;
            if (i < j.length)
                treeNode.right = j[i] == null ? null : new TreeNode(j[i]);

            if (treeNode.left != null) treeNodes.addLast(treeNode.left);
            if (treeNode.right != null) treeNodes.addLast(treeNode.right);
        }

        List<TreeNode> duplicateSubtrees = new Solution_2().findDuplicateSubtrees(root);
        duplicateSubtrees.forEach(System.out::println);

    }

    private Map<String, Pair<TreeNode, Integer>> seen = new HashMap<>();

    private List<TreeNode> repeat = new ArrayList<>();

    private int idx = 0;
    /*
    序列化
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return repeat;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0; // 所有叶节点为0
        // dfs每个节点返回其序号，dfs遍历相同结构返回缓存的节点，先序或后序; 节省空间的序列方式
        int[] triple = {root.val, dfs(root.left), dfs(root.right)};
        String hash = Arrays.toString(triple);

        if (seen.containsKey(hash)) { // 已经遍历过的结构
            Pair<TreeNode, Integer> pair = seen.get(hash);
            repeat.add(pair.getKey());
            return pair.getValue(); // 返回以前的节点的序号
        }
        else {
            seen.put(hash, new Pair<>(root, ++idx));
            return idx;
        }
    }

    public static class TreeNode {
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

        @Override
        public String toString() {
            return val + "{" + left + ", " + right + "}";
        }
    }
}