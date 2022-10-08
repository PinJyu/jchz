package com.jchz.leetcode.middle.$0672_灯泡开关Ⅱ;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-15 11:10
 */
public class Solution {

    private Set<Set<Integer>> flip1 = new HashSet<>();
    private Set<Set<Integer>> flip2 = new HashSet<>();
    private Set<Set<Integer>> flip3 = new HashSet<>();

    {
        flip1.add(Collections.singleton(1));
        flip1.add(Collections.singleton(2));
        flip1.add(Collections.singleton(3));
        flip1.add(Collections.singleton(4));

        flip2.add(new HashSet<>());
        flip2.add(Collections.singleton(1));
        flip2.add(Collections.singleton(2));
        flip2.add(Collections.singleton(3));
        flip2.add(new HashSet<>(Arrays.asList(1, 4)));
        flip2.add(new HashSet<>(Arrays.asList(2, 4)));
        flip2.add(new HashSet<>(Arrays.asList(3, 4)));

        flip3.addAll(flip2);
        flip3.add(Collections.singleton(4));

    }

    public int flipLights(int n, int presses) {
        if (presses <= 0) return 1;
        Set<Set<Integer>> operationSet;
        switch (presses) {
            case 1  : operationSet = flip1; break;
            case 2  : operationSet = flip2; break;
            default : operationSet = flip3;
        }

        Set<String> resCollection = new HashSet<>();

        for (Set<Integer> ops : operationSet) {
            BitSet bitSet = new BitSet(n);
            for (Integer op : ops) {
                operate(bitSet, op, n);
            }
            resCollection.add(bitSet.toString());
        }

        resCollection.forEach(System.out::println);

        return resCollection.size();
    }

    public static void main(String[] args) {
        new Solution().flipLights(1, 1);
    }

    private static void operate(BitSet bitSet, Integer op, int n) {
        switch (op) {
            case 1 : {
                bitSet.flip(0, n);
                break;
            }
            case 2 : {
                for (int i = 0; i < n; i += 2) {
                    bitSet.flip(i);
                }
                break;
            }
            case 3 : {
                for (int i = 1; i < n; i += 2) {
                    bitSet.flip(i);
                }
                break;
            }
            case 4 : {
                for (int i = 0; i < n; i += 3) {
                    bitSet.flip(i);
                }
                break;
            }
        }
    }
}
