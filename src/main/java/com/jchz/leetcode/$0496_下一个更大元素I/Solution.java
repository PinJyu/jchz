package com.jchz.leetcode.$0496_下一个更大元素I;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 17:03
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {137, 59, 92, 122, 52, 131, 79, 236};

        new Solution().nextGreaterElement(arr, arr);
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map  = new HashMap<>();
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0; i < nums2.length - 1; i++) {
            if (nums2[i] < nums2[i + 1]) {
                map.put(nums2[i], nums2[i + 1]);
                while (!s.isEmpty()) {
                    if (s.peek() < nums2[i + 1]) {
                        map.put(s.pop(), nums2[i + 1]);
                    }
                    else break;
                }
            }
            else {
                s.push(nums2[i]);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
