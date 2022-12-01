package com.jchz.leetcode.simple.$1025_unresolve_除数博弈;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 21:05
 */
public class Solution {
    List[] dp = null;
    public boolean divisorGame(int n) {
        if (dp == null) dp = new List[n + 1];

        List<Integer> dfs = dfs(n);
        for (Integer i : dfs) {
            if (i % 2 == 1)
                return true;
        }

        return false;
    }

    public List<Integer> dfs(int n) {
        if (n == 1) return Collections.singletonList(0);
        if (dp[n] != null) return dp[n];
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                List<Integer> deepl = dfs(n - i);
                for (int j = 0; j < deepl.size(); j++) {
                    res.add(deepl.get(j) + 1);
                }
            }
        }

        dp[n] = res;
        return res;
    }
}
