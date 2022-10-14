package com.jchz.leetcode.simple.$2363_合并相似的物品;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 23:48
 * @see
 * @since
 */
public class Solution {
    public List<List<Integer>> mergeSimilarItems_1(int[][] items1, int[][] items2) {
        int[] map = new int[1001];
        for (int[] e : items1) {
            map[e[0]] += e[1];
        }

        for (int[] e : items2) {
            map[e[0]] += e[1];
        }
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                l.add(Arrays.asList(i, map[i]));
            }
        }

        return l;
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] entry : items1) {
            map.put(entry[0], map.getOrDefault(entry[0], 0) + entry[1]);
        }
        for (int[] entry : items2) {
            map.put(entry[0], map.getOrDefault(entry[0], 0) + entry[1]);
        }

        return map.entrySet().stream()
                .map(e -> Arrays.asList(e.getKey(), e.getValue()))
                .sorted(Comparator.comparing(x -> x.get(1)))
                .collect(Collectors.toList());
    }

}
