package com.jchz.leetcode.simple.$0412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 10:19
 */
public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                res.add("Fizz");
            }
            else if (i % 5 == 0) {
                res.add("Buzz");
            }
            else {
                res.add(i + "");
            }
        }

        return res;
    }
}
