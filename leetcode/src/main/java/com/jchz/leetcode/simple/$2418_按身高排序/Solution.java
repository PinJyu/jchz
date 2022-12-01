package com.jchz.leetcode.simple.$2418_按身高排序;

import javafx.util.Pair;

import java.util.*;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 23:23
 * @see
 * @since
 */
public class Solution {
    public String[] sortPeople_1(String[] names, int[] heights) {
        Map<String, Integer> map = new IdentityHashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], heights[i]);
        }

        Arrays.sort(names, (x, y) -> map.get(y) - map.get(x));

        return names;
    }
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair<Integer, String>> pl = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            pl.add(new Pair<>(heights[i], names[i]));
        }

        pl.sort((x, y) -> -x.getKey().compareTo(y.getKey()));

        for (int i = 0; i < names.length; i++) {
            names[i] = pl.get(i).getValue();
        }

        return names;
    }

}
