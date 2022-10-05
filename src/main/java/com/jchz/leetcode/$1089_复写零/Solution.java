package com.jchz.leetcode.$1089_复写零;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 18:18
 */
public class Solution {
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int updateI = -1;
                for (int j = arr.length - 1; j >= i + 1; j--) {
                    arr[j] = arr[j - 1];
                    if (arr[j] == 0 && j != i + 1)
                       updateI = j;
                }
                i++;
                if (i != arr.length)
                    arr[i] = 0;
                if (updateI != -1)
                    i = --updateI;
            }
        }
    }

    public void duplicateZeros_1(int[] arr) {
        int n = arr.length;
        int top = 0;
        int i = -1;

        while (top < n) {
            i++;
            if (arr[i] != 0)
                top++;
            else
                top += 2;
        }

        int j = n - 1;
        if (top == n + 1) {
            arr[j] = 0;
            j--;
            i--;
        }

        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[j] == 0) {
                arr[j] = arr[i];
                j--;
            }
            i--;
        }

    }
}
