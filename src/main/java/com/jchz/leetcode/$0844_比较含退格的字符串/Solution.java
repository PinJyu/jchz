package com.jchz.leetcode.$0844_比较含退格的字符串;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 11:26
 */
public class Solution {
    public boolean backspaceCompare(String s, String t) {
        final char BACK = '#';
        Deque<Character> sq = new LinkedList<>(), tq = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c != BACK) {
                sq.push(c);
            }
            else {
                if (!sq.isEmpty())
                    sq.pop();
            }
        }

        for (char c : t.toCharArray()) {
            if (c != BACK) {
                tq.push(c);
            }
            else {
                if (!tq.isEmpty())
                    tq.pop();
            }
        }

        if (sq.size() != tq.size())
            return false;

        while (!sq.isEmpty()) {
           if (!sq.poll().equals(tq.poll()))
               return false;
        }

        return true;
    }
}
