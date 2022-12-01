package com.jchz.leetcode.simple.$0605_种花问题;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 17:58
 */
public class Solution {

    public static void main(String[] args) {
//        [1,0,0,0,1,0,0]
        new Solution().canPlaceFlowers(new int[] {0,1,0}, 1);
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (flowerbed.length == 1 || (i == 0  && flowerbed[i + 1] == 0)

                            || (flowerbed.length > 1 && i == flowerbed.length - 1 && flowerbed[i - 1] == 0)
                            || (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0))
            ) {
                if (flowerbed.length == 1) {
                    i++;
                    count++;

                    if (count >= n)
                        return true;
                }
                else if (i == 0  && flowerbed[i + 1] == 0) {
                    i++;
                    count++;

                    if (count >= n)
                        return true;
                }
                else if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0) {

                }
                i++;
                count++;

                if (count >= n)
                    return true;
            }
        }

        return false;
    }
}
