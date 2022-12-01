package com.jchz.leetcode.simple.$2231_按奇偶性交换后的最大数字;

import jdk.internal.org.objectweb.asm.tree.FrameNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 16:02
 */
public class Solution {
    public int largestInteger(int num) {
        List<Integer> fl = new LinkedList<>();

        while (num > 0) {
            fl.add(num % 10);
            num /= 10;
        }

        for (int i = 0; i < fl.size(); i++) {
            for (int j = i + 1; j < fl.size(); j++) {
                Integer l = fl.get(i), r = fl.get(j);
                if (l % 2 == r % 2 && r < l) {
                    fl.set(i, r);
                    fl.set(j, l);
                }
            }
        }

        int res = 0, radix = 1;
        for (int i = 0; i < fl.size(); i++, radix *= 10) {
            res += radix * fl.get(i);
        }

        return res;
    }
}
