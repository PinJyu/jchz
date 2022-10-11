package com.jchz.leetcode.simple.$1971_寻找图中是否存在路径;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-11 19:57
 * @see
 * @since
 */
public class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Deque<Integer> s = new LinkedList<>();
        s.push(source);
        while (!s.isEmpty()) {
            int find = s.pop();
            if (find == destination) return true;
            for (int i = 0; i < edges.length; i++) {
                int[] edge = edges[i];
                if (edge != null) {
                    int n1 = edge[0], n2 = edge[1];
                    if (find == n1) {
                        s.push(n2);
                        edges[i] = null;
                        if (n2 == destination) return true;
                    }
                    else if (find == n2) {
                        s.push(n1);
                        edges[i] = null;
                        if (n1 == destination) return true;
                    }
                }
            }
        }

        return false;
    }
}
