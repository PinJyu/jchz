package com.jchz.leetcode.simple.$2047_句子中的有效单词数;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 20:24
 * @see
 * @since
 */
public class Solution {
    public int countValidWords(String sentence) {
        String[] ss = sentence.split("\\s+");
        int count = 0;
    outer :
        for (String s : ss) {
            if (s.length() == 0)
                continue outer;
            char[] cs = s.toCharArray();
            int con = 0;
            for (int i = 0; i < cs.length; i++) {
                char c = cs[i];
                if (i == 0 && i != cs.length - 1) {
                    if (!Character.isLowerCase(c))
                        continue outer;
                    else
                        continue;
                }
                else if (i == cs.length - 1) {
                    if (c != ',' && c != '.' && c != '!' && !Character.isLowerCase(c))
                        continue outer;
                    else
                        break;
                }
                else if (Character.isDigit(c))
                    continue outer;
                else if (c == '-') {
                    ++con;
                    if (con > 1)
                        continue outer;
                    if (!Character.isLowerCase(cs[i - 1]) || !Character.isLowerCase(cs[i + 1]))
                        continue outer;
                }
                else if (!Character.isLowerCase(c))
                    continue outer;
            }
            count++;
        }


        return count;
    }
}
