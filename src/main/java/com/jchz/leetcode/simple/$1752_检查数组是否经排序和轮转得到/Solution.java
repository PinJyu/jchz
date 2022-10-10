package com.jchz.leetcode.simple.$1752_检查数组是否经排序和轮转得到;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 16:46
 */
public class Solution {
    public boolean check(int[] nums) {
        int incQSize = 1, firstSplitPostion = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1])
            {

            }
            else {
                incQSize++;
                if (firstSplitPostion == -1)
                    firstSplitPostion = i;
            }
        }

        if (incQSize > 2)
            return false;
        else if (incQSize == 1)
            return true;
        else {
            int bsh = 0, bse = firstSplitPostion - 1, ash = firstSplitPostion, ase = nums.length - 1;
            return nums[bsh] >= nums[ase];
        }
    }
}
