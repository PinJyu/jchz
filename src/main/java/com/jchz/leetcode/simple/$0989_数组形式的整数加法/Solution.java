package com.jchz.leetcode.simple.$0989_数组形式的整数加法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 14:02
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().addToArrayForm(new int[]{2,1,5}, 806);
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        int[] res = new int[num.length];
        int i = num.length - 1;
        while (k > 0 && i >= 0) {
           res[i] = k % 10;
           k /= 10;
           i--;
        }


        int carry = 0;
        for (int j = res.length - 1; j >= 0; j--) {
            int sum = res[j] + num[j] + carry;
            res[j] = sum % 10;
            if (sum > 9)
                carry = 1;
            else
                carry = 0;
        }

        List<Integer> l = new ArrayList<>();
        k += carry;
        while (k > 0) {
            l.add(k % 10);
            k /= 10;
        }
        Collections.reverse(l);

        for (int re : res) {
            l.add(re);
        }

        return l;
    }
}
