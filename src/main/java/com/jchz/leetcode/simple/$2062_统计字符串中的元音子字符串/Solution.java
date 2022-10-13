package com.jchz.leetcode.simple.$2062_统计字符串中的元音子字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 21:58
 * @see
 * @since
 */
public class Solution {
    public int countVowelSubstrings(String word) {
        char[] cs = word.toCharArray();
        int count = 0;
    outer:
        for (int i = 0; i + 4 < cs.length; i++) {
            int bm = 0;
            for (int j = i; j < cs.length; j++) {
                char c = cs[j];
                switch (c) {
                    case 'a': bm |= 1; break;
                    case 'e': bm |= 1 << 1; break;
                    case 'i': bm |= 1 << 2; break;
                    case 'o': bm |= 1 << 3; break;
                    case 'u': bm |= 1 << 4; break;
                    default: {
                        if (bm != 0b11111)
                            i = j;
                        continue outer;
                    }
                }
                if (bm == 0b11111)
                    count++;
            }

            if (bm != 0b11111)
                break;
        }

        return count;
    }

}
