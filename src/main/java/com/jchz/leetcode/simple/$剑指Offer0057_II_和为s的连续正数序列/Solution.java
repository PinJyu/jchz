package com.jchz.leetcode.simple.$剑指Offer0057_II_和为s的连续正数序列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 14:18
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> li = new ArrayList<>();
        int maxLength = 0;
        int l = 1, r = 2, sum = 3;

        while (l < r && r <= target / 2 + 1) {
            if (sum < target) {
                r++;
                sum += r;
            }
            else if (sum > target){
                sum -= l;
                l++;
            }
            else {
                maxLength = Math.max(r - l + 1, maxLength);
                li.add(Arrays.asList(l, r));
                r++;
                sum += r;
            }
        }

        int[][] ret = new int[li.size()][];
        for (int i = 0; i < li.size(); i++) {
            List<Integer> pair = li.get(i);
            int index = 0, s = pair.get(0), e = pair.get(1);
            int[] inner = new int[e - s + 1];
            for (int j = s; j <= e; j++) {
                inner[index++] = j;
            }
            ret[i] = inner;
        }


        return ret;
    }

}
