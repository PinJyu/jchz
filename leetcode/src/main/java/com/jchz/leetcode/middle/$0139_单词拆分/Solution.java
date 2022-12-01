package com.jchz.leetcode.middle.$0139_单词拆分;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-08 19:28
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i)))
                    dp[i] = true;
            }
        }

        return dp[n];

    }

}
