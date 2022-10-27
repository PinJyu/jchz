package com.jchz.leetcode.middle.$1476_子矩形查询;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 18:36
 */
public class Solution {
    class SubrectangleQueries {

        int[][] rectangle;
        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for(int i = row1; i <= row2; i++) {
                for(int j = col1; j <= col2; j++) {
                    rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return rectangle[row][col];
        }
    }

//
//    class SubrectangleQueries {
//
//        int[][] rectangle;
//        List<int[]> history = new ArrayList<>();
//
//        public SubrectangleQueries(int[][] rectangle) {
//            this.rectangle = rectangle;
//        }
//
//        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
//            history.add(new int[]{row1, col1, row2, col2, newValue});
//        }
//
//        public int getValue(int row, int col) {
//            for (int i = history.size() - 1; i >= 0; i--) {
//                int[] change = history.get(i);
//                if (change[0] <= row && row <= change[2] && change[1] <= col && col <= change[3])
//                    return change[4];
//            }
//
//            return rectangle[row][col];
//        }
//    }
}
