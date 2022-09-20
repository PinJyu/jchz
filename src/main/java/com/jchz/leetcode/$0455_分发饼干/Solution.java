package com.jchz.leetcode.$0455_分发饼干;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 12:33
 */
public class Solution {
    // 贪心算法
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0, i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                res++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        return res;
    }
//    public int findContentChildren(int[] g, int[] s) {
//        int res = 0;
//        Arrays.sort(s);
//        List<Integer> sl = new ArrayList<>();
//        for (int i : s) {
//            sl.add(i);
//        }
//        for (int i : g) {
//
//            int j = binarySearch(sl, i);
//
//            if (j >= i) {
//                res++;
//                sl.remove(j);
//            }
//        }
//
//        return res;
//    }
//
//    public int binarySearch(List<Integer> s, int i) {
//        int l = 0, r = s.size() - 1;
//
//        while (l < r) {
//            int mid = (l + r + 1) / 2;
//            if (s.get(mid) >= i) {
//                r = mid;
//            }
//            else {
//                l = ++mid;
//            }
//        }
//        return l;
//    }
}
