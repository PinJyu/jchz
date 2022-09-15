package com.jchz.leetcode.$1619_删除某些元素后的数组均值;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 17:58
 */
public class Solution {


    public double trimMean_1(int[] arr) {

        Arrays.sort(arr);

        double sum = 0;
        for (int i = arr.length / 20; i < arr.length * 19 / 20; i++) {
            sum += arr[i];
        }
        return sum / (arr.length * 0.9);
    }

    // 自写的快排超时
    public double trimMean(int[] arr) {

        quickSort(arr, 0, arr.length - 1);
        int count = arr.length / 20 / 2 + 1;

        double sum = 0;
        for (int i = count; i < arr.length - count; i++) {
            sum += arr[i];
        }
        return sum / (arr.length - count << 2);
    }

//    public static void main(String[] args) {
//        int[] arr = {6, 5, 4, 3, 2, 1};
//
//        quickSort(arr, 0, 5);
//        System.out.println(Arrays.toString(arr));
//    }
    public static void quickSort(int[] arr, int begin, int end) {
        if (end - begin <= 1) return;

        int mid = arr[begin], l = begin, r = end;

        while (l < r) {
            if (arr[l] >= mid) {
                swap(arr, l, r);
                r--;
            }

            if (arr[r] < mid) {
                swap(arr, l, r);
                l++;
            }
        }

        quickSort(arr, begin, l);
        quickSort(arr, r, end);

    }

    private static void swap(int[] arr, int l, int r) {
        int t = arr[r];
        arr[r] = arr[l];
        arr[l] = t;
    }
}
