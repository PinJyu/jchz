package com.jchz.leetcode.structure;

import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 11:52
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
