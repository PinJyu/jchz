package com.jchz.leetcode.$1299_将每个元素替换为右侧最大元素;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 19:47
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = arr[i];
            arr[i] = max;
            max = Math.max(j, max);
        }

        return arr;
    }
}
