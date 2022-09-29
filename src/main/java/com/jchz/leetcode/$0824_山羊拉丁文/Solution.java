package com.jchz.leetcode.$0824_山羊拉丁文;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 16:10
 */
public class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        char[] cs = sentence.toCharArray();
        int index = 0;
        char tail = (char) -1;
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (Character.isLetter(c)) {
                if (sb.length() == 0 && !Character.isLetter(tail)) {
                    index++;
                    if (isAEIOU(c)) {
                        sb.append(c);
                    }
                    else {
                        tail = c;
                    }
                }
                else {
                    sb.append(c);
                }
            }
            else {
                if (Character.isLetter(tail)) {
                    sb.append(tail);
                    tail = (char) -1;
                }

                if (sb.length() > 0) {
                    sb.append("ma");
                    for (int j = 0; j < index; j++) {
                        sb.append('a');
                    }
                    res.append(sb);
                    sb = new StringBuilder();
                }
                res.append(c);
            }

        }

            if (Character.isLetter(tail)) {
                sb.append(tail);
            }

            if (sb.length() > 0) {
                sb.append("ma");
                for (int j = 0; j < index; j++) {
                    sb.append('a');
                }
                res.append(sb);
            }
        return res.toString();
    }

    private boolean isAEIOU(char c) {
        return (c |= 32) == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
