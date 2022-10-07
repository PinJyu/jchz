package com.jchz.leetcode.$1342_将数字变成0的操作次数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 23:02
 */
public class Solution {
    public int numberOfSteps(int num) {

        int count = 0;
        while (num > 1) {
            if (num % 2 == 1)
                num--;
            else
                num >>= 1;
            count++;
        }

        return count;
    }
}
