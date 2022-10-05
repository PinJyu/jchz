package com.jchz.leetcode.$1122_数组的相对排序;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 19:45
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] positionMap = new int[1001], counts = new int[arr2.length + 1], res = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            positionMap[arr2[i]] = i + 1;
        }
        int tail = res.length - 1;
        for (int i : arr1) {
            if (positionMap[i] == 0) {
                res[tail] = i;
                tail--;
            }
            else counts[positionMap[i]]++;
        }

        int index = 0;
        for (int i = 1; i < counts.length; i++) {
            int count = counts[i];
            while (count > 0) {
                res[index]= arr2[i - 1];
                count--;
                index++;
            }
        }

        tail++;
        if (tail < res.length)
            Arrays.sort(res, tail, res.length);


        return res;
    }

}
