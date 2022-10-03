package com.jchz.leetcode.$0941_有效的山脉数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 20:08
 */
public class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean inc = false, dec = false;
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > arr[i - 1]) {
               inc = true;
               if (dec)
                   return false;
           }
           else if (arr[i] < arr[i - 1]) {
               dec = true;
               if (!inc)
                   return false;
           }

           else
               return false;
        }

        return inc && dec;
    }
}
