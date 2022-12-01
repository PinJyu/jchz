package com.jchz.leetcode.middle.$0105_从前序与中序遍历序列构造二叉树;

import com.jchz.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-31 20:02
 */
public class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr)
            return null;
        int val = preorder[pl];
        TreeNode root = new TreeNode(val);
        int center = map.get(val);


        root.left = build(preorder, pl + 1, pl + (center - il), inorder, il, center - 1);
        root.right = build(preorder, pl + (center - il) + 1, pr, inorder, center + 1, ir);

        return root;
    }
}
