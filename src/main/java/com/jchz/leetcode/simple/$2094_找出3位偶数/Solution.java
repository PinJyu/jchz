package com.jchz.leetcode.simple.$2094_找出3位偶数;

import java.util.*;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 23:24
 * @see
 * @since
 */
public class Solution {
    List<Integer> ret = new ArrayList<>();
    public int[] findEvenNumbers_2(int[] digits) {
        List<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : digits) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

    outer:
        for (int i = 100; i < 1000; i += 2) {
            int t = i;
            Map<Integer, Integer> map1 = new HashMap<>();
            while (t > 0) {
                map1.put(t % 10, map1.getOrDefault(t % 10, 0) + 1);
                t /= 10;
            }
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                Integer j = map1.get(entry.getKey());
                if (j == null || entry.getValue() > j)
                    continue outer;
            }

            ret.add(i);
        }
        int[] re = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            re[i] = ret.get(i);
        }

        return re;
    }

    public int[] findEvenNumbers_1(int[] digits) {
        List<Integer> ret = new ArrayList<>();
        Arrays.sort(digits);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < digits.length; j++) {
                if (j == i)
                    continue;
                for (int k = 0; k < digits.length; k++) {
                    if (k != j && k != i && digits[k] % 2 == 0) {
                        int sum = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (sum > 99 && (ret.size() == 0 || sum > ret.get(ret.size() - 1))) {
                            ret.add(sum);
                        }
                    }
                }
            }
        }

        int[] re = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            re[i] = ret.get(i);
        }

        return re;
    }
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);

        trace(digits, new LinkedList<>());
        int[] re = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            re[i] = ret.get(i);
        }

        return re;
    }

    void trace(int[] digits, List<Integer> q) {
        if (q.size() == 3) {
            int sum = 0; int r = 1;

            for (int i = q.size() - 1; i >= 0; i--) {
                sum += digits[q.get(i)] * r;
                r *= 10;
            }

            if (sum > 99 && sum % 2 == 0 && (ret.size() == 0 || sum > ret.get(ret.size() - 1))) {
                ret.add(sum);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (q.contains(i) || (i > 0 && digits[i] == digits[i - 1]))
                continue;
            q.add(i);
            trace(digits,  q);
            q.remove(q.size() - 1);
        }
    }


}
