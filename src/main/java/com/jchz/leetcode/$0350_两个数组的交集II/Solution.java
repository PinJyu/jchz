package com.jchz.leetcode.$0350_两个数组的交集II;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 14:42
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i : nums1) {
            Integer v = map1.getOrDefault(i, 0);
            map1.put(i, ++v);
        }

        for (int i : nums2) {
            Integer v = map2.getOrDefault(i, 0);
            map2.put(i, ++v);
        }

        List<Integer> res = new ArrayList<>();


        for (Integer k : map1.keySet()) {
            Integer v = map1.get(k);
            if (map2.containsKey(k)) {
                Integer v_ = map2.get(k);
                for (int i = 0; i < Math.min(v, v_); i++) {
                    res.add(k);
                }
            }
        }

        int[] ints = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ints[i] = res.get(i);
        }

        return ints;
    }
    public int[] intersect_1(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }


        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int vn = map1.getOrDefault(nums1[i], 0) + 1;
            map1.put(nums1[i], vn);
        }

        int[] res = new int[nums1.length];
        int index = 0;
        for (int i : nums2) {

            Integer v = map1.getOrDefault(i, 0);
            System.out.println(i + ", " + v);
            if (v > 0) {
                res[index++] = i;
                map1.compute(i, (k, v_) -> --v_ > 0 ? v_ : null);
            }
        }
        System.out.println(Arrays.toString(res));

        return Arrays.copyOfRange(res, 0, index);
    }

    public static void main(String[] args) {
        new Solution().intersect_1(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    }
}
