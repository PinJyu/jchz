package com.jchz.leetcode.$0929_独特的电子邮件地址;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 18:59
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {

            StringBuilder sb = new StringBuilder();
            char[] cs = email.toCharArray();
            boolean startFind = false, containAt = false;
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '@')
                    containAt = true;
                if ('+' == cs[i]) {
                    while(++i < cs.length) {
                        if (cs[i] == '@')
                           break;
                    }
                    i--;
                }
                else if ('.' == cs[i] && !containAt) {

                }
                else {
                   sb.append(cs[i]);
                }
            }

            set.add(sb.toString());
        }

        return set.size();
    }

    public int numUniqueEmails_1(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            set.add(email.replaceAll("\\.(?=.*@)|\\+.*(?=@)", ""));
        }

        return set.size();

    }

}
