package com.jchz.leetcode.simple.$LCP0007_传递信息;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 12:01
 * @see
 * @since
 */
public class Solution {
    int count = 0;

    public int numWays(int n, int[][] relation, int k) {
        dfs(relation, 0, n - 1, 0, k);
        return count;
    }

    void dfs(int[][] relation, int b, int e, int deep, int k) {
        deep++;
        for (int i = 1; i < relation.length - 1; i++) {
            if (relation[i][0] == b) {
                if (deep == k && relation[i][1] == e) {
                    count++;
                }
                else if (deep < k) {
                    dfs(relation, relation[i][1], e, deep, k);
                }
            }
        }
    }

}
