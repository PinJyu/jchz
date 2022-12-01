package com.jchz.leetcode.middle.$0131_分割回文串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-08 18:27
 */
public class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n + 1][n + 1];
        Arrays.fill(dp[1], true);
        List<List<String>> ans = new ArrayList<>();
        backtrack(dp, 0, s, n, new ArrayList<>(), ans);
        return ans;
    }


    void backtrack(boolean[][] dp, int start, String s,  int n, List<String> state, List<List<String>> ans) {
        if (start == n) {
            ans.add(new ArrayList<>(state));
            return;
        }

        for (int i = start; i < n; i++) {
            if (s.charAt(i) == s.charAt(start) && (i - 1 < start + 1 || dp[i - 1 - start][start + 1])) {
                state.add(s.substring(start, i + 1));
                dp[i - start + 1][start] = true;
                backtrack(dp, i + 1, s, n, state, ans);
                state.remove(state.size() - 1);
            }
        }
    }

}
