package com.jchz.leetcode.simple.$0590_N叉树的后序遍历;

import com.jchz.leetcode.structure.Node;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 16:01
 */
public class Solution {
    public List<Integer> postorder(Node root) {

        List<Integer> res = new LinkedList<>();
        Deque<Node> s = new LinkedList<>();
        Set<Node> set = new HashSet<>();

        s.push(root);

        if (root == null) return res;
        while (!s.isEmpty()) {
            root = s.peek();
            if (root.children != null && root.children.size() > 0 && !set.contains(root)) {
                for (int i = root.children.size() - 1; i >= 0; i-- ) {
                        s.push(root.children.get(i));
                }
                set.add(root);
            }
            else {
                res.add(root.val);

                s.pop();
            }
        }

        return res;
    }
}
