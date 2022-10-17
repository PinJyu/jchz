package com.jchz.leetcode.simple.$LCP0033_蓄水;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 15:28
 * @see
 * @since
 */
public class Solution {
    public int storeWater(int[] bucket, int[] vat) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bucket.length; i++) {
            if (vat[i] == 0)
                continue;
            int c = bucket[i] == 0 ? vat[i] : vat[i] / bucket[i] + (vat[i] % bucket[i] == 0 ? 0 : 1);
            max = Math.max(max, c);
        }

        int minCount = Integer.MAX_VALUE;
        for (int i = 1; i <= max; i++) {
            int count = i;
            for (int j = 0; j < bucket.length; j++) {
                int bi = bucket[j], vi = vat[j];
                if (vi == 0) continue;
                while (bi * i < vi) {
                    bi++;
                    count++;
                }
            }
            minCount = Math.min(minCount, count);
        }

        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }

}
