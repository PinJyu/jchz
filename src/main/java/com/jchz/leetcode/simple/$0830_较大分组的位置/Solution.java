package com.jchz.leetcode.simple.$0830_较大分组的位置;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 16:40
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().largeGroupPositions(
                "abbxxxxzzy");
    }
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            res.add(Collections.emptyList());
        }
        char[] cs = s.toCharArray();
        int indexBegin = 0, resIndex = 0;
        for (int i = 1; i < cs.length; i++) {
            if (cs[i] != cs[i - 1]) {
                indexBegin = i;
                resIndex++;
            }
            else {
                if (i - indexBegin + 1 >= 3) {
                    if (res.get(resIndex).equals(Collections.emptyList())) {
                        List<Integer> t = new ArrayList<>();
                        t.add(indexBegin);
                        t.add(i);
                        res.set(resIndex, t);
                    }
                    else {
                        List<Integer> t = res.get(resIndex);
                        t.set(1, i);
                    }
                }
            }
        }

        return res.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList());

    }

    public List<List<Integer>> largeGroupPositions_1(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char[] cs = s.toCharArray();
        int num = 1;
        for (int i = 0; i < cs.length; i++) {
            if (i == cs.length - 1 || cs[i] != cs[i + 1]) {
                if (num >= 3) {
                    res.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            }
            else {
                num++;
            }
        }

        return res;
    }

}
