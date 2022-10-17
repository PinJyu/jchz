package com.jchz.leetcode.simple.$2243_计算字符串的数字和;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 16:34
 */
public class Solution {
    public String digitSum(String s, int k) {
        List<Character> n = new ArrayList<>();
        List<Character> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            l.add(c);
        }

        while (l.size() > k) {
            for (int i = 0; i < l.size();) {
                int next = i + k, begin = i;
                int sum = 0;
                while (begin < next && begin < l.size()) {
                    sum += l.get(begin) - '0';
                    begin++;
                }
                i = next;

                List<Character> t = new ArrayList<>();
                if (sum == 0)
                    t.add('0');
                else {
                    while (sum > 0) {
                        t.add((char) (sum % 10 + '0'));
                        sum /= 10;
                    }
                }


                for (int j = t.size() - 1; j >= 0; j--) {
                    n.add(t.get(j));
                }
            }
            l = n;
            n = new ArrayList<>();
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : l) {
            sb.append((char)character);
        }

        return sb.toString();
    }


}
