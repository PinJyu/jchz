package com.jchz.leetcode.$0997_找到小镇的法官;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 15:55
 */
public class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> trustSet = new HashSet<>();

        for (int[] arr : trust) {
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            trustSet.add(arr[0]);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n - 1 && !trustSet.contains(entry.getKey()))
                return entry.getKey();
        }

        return n != 1 ? -1 : 1;
    }


    // 有向图出度入度
    public int findJudge_1(int n, int[][] trust) {
        int[] inOutDegree = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            inOutDegree[trust[i][0]]--;
            inOutDegree[trust[i][1]]++;
        }

        for (int i = 0; i < inOutDegree.length; i++) {
            if (inOutDegree[i] == n - 1)
                return i;
        }

        return -1;
    }
}
