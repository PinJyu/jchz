package com.jchz.leetcode.simple.$1791_找出星型图的中心节点;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:09
 * @see
 * @since
 */
public class Solution {

    public int findCenter(int[][] edges) {
        int m = edges[0][0], n = edges[0][1];
        return edges[1][0] == m ? m :
                edges[1][0] == n ? n :
                        edges[1][1] == m ? m :
                                edges[1][1] == n ? n : -1;
    }
}
