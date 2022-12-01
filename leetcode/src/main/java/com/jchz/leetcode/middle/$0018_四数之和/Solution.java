package com.jchz.leetcode.middle.$0018_四数之和;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-28 16:03
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> ret = new ArrayList<>();

        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
                break;
            if ((long) nums[i] + nums[length - 1] + nums[length - 2] + nums[length - 3] < target)
                continue;

            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                if ((long) nums[j] + nums[j + 1] + nums[j + 2] + nums[i] > target)
                    break;
                if ((long) nums[j] + nums[length - 1] + nums[length - 2] + nums[i] < target)
                    continue;

                long wish = (long) target - nums[i] - nums[j];
                int l = j + 1, r = length - 1;
                while (l < r) {
                    int sum = nums[l] + nums[r];
                    if (sum == wish) {
                        ret.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        int ll = l + 1, rr = r - 1;
                        while (ll < r && nums[ll] == nums[l]) {
                            ll++;
                        }
                        while (rr < l && nums[rr] == nums[r]) {
                            rr--;
                        }
                        l = ll;
                        r = rr;
                    }
                    else if (sum < wish)
                        l++;
                    else
                        r--;
                }
            }
        }

        return ret;
    }

}
