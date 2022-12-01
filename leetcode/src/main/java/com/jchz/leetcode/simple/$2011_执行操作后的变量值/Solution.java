package com.jchz.leetcode.simple.$2011_执行操作后的变量值;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 16:29
 */
public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int countPostive = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+')
                countPostive++;
        }

        return countPostive + (countPostive - operations.length);
    }
}
