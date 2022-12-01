package com.jchz.leetcode.middle.$0022_括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-08 16:32
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrace(new StringBuilder(), n, 0, 0, ans);
        return ans;
    }

    void backtrace(StringBuilder sb, int n, int l, int r, List<String> ans) {
        if (sb.length() == n * 2) {
            ans.add(sb.toString());
            return;
        }

        if (l < n) {
            sb.append("(");
            backtrace(sb, n, l + 1, r, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (l > r) {
            sb.append(")");
            backtrace(sb, n, l, r + 1, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
