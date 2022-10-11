package com.jchz.leetcode.simple.$1925_统计平方和三元组的数目;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:21
 */
public class Solution {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = n; k >= 1; k--) {
                    if (k * k == j * j + i * i) {
                        count++;
                        break;
                    }
                    else if (k * k < j * j + i * i)
                        break;
                }
            }
        }

        return count * 2;
    }

}
