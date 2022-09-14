package com.jchz.leetcode.$0652_寻找重复的子树;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-05 12:44
 */

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
class Solution {

    private Map<Integer, Set<TreeNode>> samliarNode = new LinkedHashMap<>();

    private Map<Integer, List<TreeNode>> sameNode = new HashMap<>();

    private TreeNode root;

    public static void main(String[] args) {
        Integer[] j = {0,0,0,0,null,null,0,null,null,0};

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

        List<TreeNode> duplicateSubtrees = new Solution().findDuplicateSubtrees(root);
        duplicateSubtrees.forEach(System.out::println);

    }

    // 暴力求解超时
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        this.root = root;
        dfs(root);
        System.out.println(sameNode.values());
        return sameNode.values().stream().flatMap(l -> l.stream()).distinct()
                .collect(Collectors.toList());
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        if (root != this.root) {
            Set<TreeNode> treeNodes = samliarNode.getOrDefault(root.val, new LinkedHashSet<>());

            for (TreeNode treeNode : treeNodes) {
                if (compareTree(treeNode, root)) {
                    List<TreeNode> treeNodes_ = sameNode.getOrDefault(root.val, new ArrayList<>());
                    treeNodes_.add(treeNode);
                    sameNode.put(root.val, treeNodes_);
                    break;
                }
            }
            treeNodes.add(root);
            samliarNode.put(root.val, treeNodes);

        }

        dfs(root.left);
        dfs(root.right);
    }

    private boolean compareTree(TreeNode one, TreeNode other) {
            return one == other ||
                    (
                            (one != null && other != null)
                            && one.val == other.val
                            && compareTree(one.left, other.left)
                            && compareTree(one.right, other.right)
                    );
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