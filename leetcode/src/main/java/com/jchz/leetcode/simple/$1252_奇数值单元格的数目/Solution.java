package com.jchz.leetcode.simple.$1252_奇数值单元格的数目;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 15:17
 */
public class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] x = new int[m], y = new int[n];

        int xOdd = 0, xEven = 0, yOdd = 0, yEven = 0;
        for (int[] index : indices) {
            x[index[0]]++;
            y[index[1]]++;
            if (x[index[0]] % 2 == 1)
                xOdd++;
            else
                xOdd--;

            if (y[index[1]] % 2 == 1)
                yOdd++;
            else
                yOdd--;
        }

        xEven = m - xOdd;
        yEven = n - yOdd;

        return xOdd * n - xOdd * yOdd +  xEven * yOdd;
    }
}
