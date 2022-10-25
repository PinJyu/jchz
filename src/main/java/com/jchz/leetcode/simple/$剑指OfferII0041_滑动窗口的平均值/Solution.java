package com.jchz.leetcode.simple.$剑指OfferII0041_滑动窗口的平均值;


/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 18:49
 * @see
 * @since
 */
public class Solution {
    class MovingAverage {

        final int size;
        final int[] arr;
        int sum = 0, index = 0;


        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        public double next(int val) {
            int remove = arr[index % size];
            arr[index % size] = val;
            sum = sum - remove + val;
            index++;

            return sum / (double) Math.min(index, size);
        }
    }


//    class MovingAverage {
//
//        final int size;
//        Queue<Integer> q = new LinkedList<>();
//        int sum = 0;
//
//
//        /** Initialize your data structure here. */
//        public MovingAverage(int size) {
//            this.size = size;
//        }
//
//        public double next(int val) {
//            if (q.size() < size) {
//                q.offer(val);
//                sum += val;
//            }
//            else {
//                Integer first = q.poll();
//                q.offer(val);
//                sum += val;
//                sum -= first;
//            }
//
//            return sum / (double) q.size();
//        }
//    }


}
