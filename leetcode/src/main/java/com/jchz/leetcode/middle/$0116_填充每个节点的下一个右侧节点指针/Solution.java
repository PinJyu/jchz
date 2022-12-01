package com.jchz.leetcode.middle.$0116_填充每个节点的下一个右侧节点指针;


import com.jchz.leetcode.structure.repeat.Node;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 18:10
 */
public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Node left = root.left;
        Node right = root.right;
        if (left != null) {
            left.next = right;
            connect(left);
            connect(right);
            left = left.right;
            right = right.left;
            while (left != null) {
                left.next = right;
                left = left.right;
                right = right.left;
            }
        }


        return root;

    }
}

