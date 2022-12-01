package com.jchz.leetcode.simple.$LCP0051_烹饪料理;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 19:53
 */
public class Solution {

    int max = -1;
    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        backTrace(0, materials, cookbooks, attribute, limit, new LinkedList<>());

        return max;
    }

    void backTrace(int start, int[] materials, int[][] cookbooks, int[][] attribute, int limit, List<int[]> attrs) {
        for (int i : materials) {
            if (i < 0) {
                if (attrs.size() > 0) {
                    int sum1 = 0, sum2 = 0;
                    for (int j = 0; j < attrs.size() - 1; j++) {
                        int[] attr = attrs.get(j);
                        sum1 += attr[0];
                        sum2 += attr[1];
                    }
                    if (sum2 > limit)
                        max = Math.max(sum1, max);
                }

                return;
            }
        }
        if (start >= cookbooks.length) {
            if (attrs.size() > 0) {
                int sum1 = 0, sum2 = 0;
                for (int j = 0; j < attrs.size(); j++) {
                    int[] attr = attrs.get(j);
                    sum1 += attr[0];
                    sum2 += attr[1];
                }
                if (sum2 >= limit)
                    max = Math.max(sum1, max);
            }

            return;
        }

        for (int i = start; i < cookbooks.length; i++) {
            for (int j = 0; j < materials.length; j++) {
                materials[j] -= cookbooks[i][j];
            }
            attrs.add(attribute[i]);
            backTrace(i + 1, materials, cookbooks, attribute, limit, attrs);
            attrs.remove(attrs.size() - 1);
            for (int j = 0; j < materials.length; j++) {
                materials[j] += cookbooks[i][j];
            }
        }
    }
}
