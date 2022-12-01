package com.jchz.leetcode.simple.$剑指Offer0040_最小的k个数;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-18 11:57
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        random_partion(arr, 0, arr.length - 1, k);
        int[] ret = new int[k];
        System.arraycopy(arr, 0, ret, 0, ret.length);

        return ret;
    }

    void random_partion(int[] arr, int l, int r, int k) {
        if (l >= r)
            return;
        int mid = new Random().nextInt(r - l + 1) + l;
        swap(arr, r, mid);

        int pos = partion(arr, l, r);
        int num = pos - l + 1;
        if (num == k)
            return;
        else if (num < k)
            random_partion(arr, pos + 1, r, k - num);
        else
            random_partion(arr, l, pos - 1, k);
    }

    int partion(int[] arr, int l, int r) {
        int pivot = arr[r];
        int j = l - 1;
        for (int i = l; i <= r - 1; i++) {
            if (arr[i] <= pivot) {
                j++;
                swap(arr, i, j);
            }
        }

        swap(arr, r, j + 1);

        return j + 1;
    }

    void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public int[] getLeastNumbers_1(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : arr) {
            heap.offer(i);
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = heap.poll();
        }

        return ret;
    }

}
