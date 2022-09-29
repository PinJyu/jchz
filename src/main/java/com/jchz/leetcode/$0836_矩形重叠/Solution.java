package com.jchz.leetcode.$0836_矩形重叠;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 18:08
 */
public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int ax1 = rec1[0];
        int ay1 = rec1[1];
        int ax2 = rec1[2];
        int ay2 = rec1[3];
        int bx1 = rec2[0];
        int by1 = rec2[1];
        int bx2 = rec2[2];
        int by2 = rec2[3];

        return (ax1 - bx2 != 0 & ax2 - bx1 != 0 & ax1 - bx2 < 0 ^ ax2 - bx1 < 0) &&
                (ay1 - by2 != 0 & ay2 - by1 != 0 & ay1 - by2 < 0 ^ ay2 - by1 < 0);
    }
}
