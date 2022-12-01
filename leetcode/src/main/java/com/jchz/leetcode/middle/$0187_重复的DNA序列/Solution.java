package com.jchz.leetcode.middle.$0187_重复的DNA序列;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-28 12:35
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        if (n < 10)
            return ans;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i + 10 <= n; i++) {
            String subStr = s.substring(i, i + 10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                ans.add(entry.getKey());
        }

        return ans;
    }
}
