package com.jchz.leetcode.simple.$1603_设计停车系统;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 17:23
 */
public class Solution {
    class ParkingSystem {

        int[] arr = new int[4];
        public ParkingSystem(int big, int medium, int small) {
            arr[1] = big;
            arr[2] = medium;
            arr[3] = small;
        }

        public boolean addCar(int carType) {
            return arr[carType]-- > 0;
        }
    }
}
