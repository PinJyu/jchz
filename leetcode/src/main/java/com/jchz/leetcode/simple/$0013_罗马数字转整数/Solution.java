package com.jchz.leetcode.simple.$0013_罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-08 17:07
 */
public class Solution {

//    字符          数值
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    private Map<String, Integer> roma2num = new HashMap<>();

    public int romanToInt(String s) {
        int sum = 0;
        int prev = 10000;

        for (int i = 0; i < s.length(); i++) {
            int cur = 0;
            switch (s.charAt(i)) {
                case 'I' : cur = 1; break;
                case 'V' : cur = 5; break;
                case 'X' : cur = 10; break;
                case 'L' : cur = 50; break;
                case 'C' : cur = 100; break;
                case 'D' : cur = 500; break;
                case 'M' : cur = 1000; break;
            }
            final int cur_ = cur;
            if (cur > prev)
                cur = cur - prev - prev;
            prev = cur_;
            sum += cur;
        }

        return sum;
    }

    public static void main(String[] args) {
        int mcmxciv = new Solution().romanToInt("MCMXCIV");
        System.out.println(mcmxciv);
    }
}
