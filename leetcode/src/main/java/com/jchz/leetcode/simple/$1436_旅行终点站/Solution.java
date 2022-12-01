package com.jchz.leetcode.simple.$1436_旅行终点站;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:04
 * @see
 * @since
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!set.contains(path.get(1)))
                return path.get(1);
        }

        return null;
    }
}
