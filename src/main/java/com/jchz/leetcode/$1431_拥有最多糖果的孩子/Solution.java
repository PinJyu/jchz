package com.jchz.leetcode.$1431_拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 18:59
 * @see
 * @since
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ret = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            ret.add(candy + extraCandies >= max);
        }

        return ret;
    }
}
