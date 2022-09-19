package com.jchz.leetcode.$0283_移动零;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 12:42
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int zp, nzp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zp = i;
                nzp = Math.max(zp, nzp);
                while (nzp < nums.length) {
                    if (nums[nzp] != 0) {
                        nums[zp] = nums[nzp];
                        nums[nzp] = 0;
                        nzp++;
                        break;
                    }
                    nzp++;
                }
                if (nzp == nums.length) {
                    break;
                }
            }
        }
    }

    public void moveZeroes_1(int[] nums) {
        int l = 0, r = 0, n = nums.length;
        while (r < n) {
            if (nums[r] != 0) {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;
            }
            r++;
        }
    }
}
