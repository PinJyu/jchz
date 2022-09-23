package com.jchz.leetcode.$0589_N叉树的前序遍历;

import com.jchz.leetcode.structure.Node;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 14:34
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
//        Deque<Node> ps = new LinkedList<>();
        Deque<Iterator<Node>> bs = new LinkedList<>();

        while (root != null || !bs.isEmpty()) {
            if (root != null) {
                while (root.children != null && root.children.size() > 0) {
                    res.add(root.val);
                    Iterator<Node> iterator = root.children.iterator();
                    if (iterator.hasNext()) {
                        root = iterator.next();
//                    ps.push(root);
                        bs.push(iterator);
                    }
                }

                res.add(root.val);
            }
            if (bs.isEmpty()) return res;
            Iterator<Node> brothersIterator = bs.peek();
            if (brothersIterator.hasNext())
                root = brothersIterator.next();
            else {
                bs.pop();
                root = null;
            }
        }

        return res;
    }
}
