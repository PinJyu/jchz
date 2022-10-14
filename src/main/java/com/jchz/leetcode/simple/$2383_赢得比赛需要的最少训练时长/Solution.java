package com.jchz.leetcode.simple.$2383_赢得比赛需要的最少训练时长;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 00:52
 * @see
 * @since
 */
public class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        int sumEnergy = Arrays.stream(energy).sum() + 1;
        if (sumEnergy > initialEnergy)
            hours += sumEnergy - initialEnergy;

        for (int i : experience) {
            if (initialExperience > i) {
                initialExperience += i;
            }
            else {
                hours += i + 1 - initialExperience;
                initialExperience = i + i + 1;
            }
        }

        return hours;
    }

}
