package com.jchz.leetcode.simple.$1656_设计有序流;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 22:50
 * @see
 * @since
 */
public class Solution {
    class OrderedStream {
        int ptr = 1;
        List<String> l = new ArrayList<>();
        public OrderedStream(int n) {
            for (int i = 0; i < n + 1; i++) {
                l.add(null);
            }
        }

        public List<String> insert(int idKey, String value) {
            l.set(idKey, value);

            List<String> ret = new ArrayList<>();
            for (;ptr < l.size(); ptr++) {
                if (!"".equals(l.get(ptr)))
                    ret.add(l.get(ptr));
                else
                    break;
            }

            return ret;
        }
    }
}
