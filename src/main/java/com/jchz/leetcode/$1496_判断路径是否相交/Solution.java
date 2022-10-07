package com.jchz.leetcode.$1496_判断路径是否相交;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 21:31
 * @see
 * @since
 */
public class Solution {
    public boolean isPathCrossing(String path) {
        int nsStack = 0, ewStack = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N': nsStack++; break;
                case 'S': nsStack--; break;
                case 'E': ewStack++; break;
                case 'W': ewStack--; break;
            }

            if (!set.add(nsStack * 20001 + ewStack))
                return true;
        }

        return false;
    }
}
