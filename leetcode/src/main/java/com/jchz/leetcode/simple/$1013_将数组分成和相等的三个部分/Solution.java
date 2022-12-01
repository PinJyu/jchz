package com.jchz.leetcode.simple.$1013_将数组分成和相等的三个部分;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 18:25
 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if (sum % 3 != 0)
            return false;
        else {
            sum /= 3;
            int reduce = 0, count = 0;
            for (int i = 0; i < arr.length; i++) {
                reduce += arr[i];
                if (reduce == sum) {
                    count++;
                    reduce = 0;
                }
            }
            return count == 3;
        }
    }
}
