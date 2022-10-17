package com.jchz.leetcode.simple.$2224_转化时间需要的最少操作数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 15:38
 */
public class Solution {
    public int convertTime(String current, String correct) {
        char[] cs_1 = current.toCharArray();
        char[] cs_2 = correct.toCharArray();
        int curHH = (cs_1[0] - '0') * 10 + (cs_1[1] - '0');
        int curMM = (cs_1[3] - '0') * 10 + (cs_1[4] - '0');
        int corHH = (cs_2[0] - '0') * 10 + (cs_2[1] - '0');
        int corMM = (cs_2[3] - '0') * 10 + (cs_2[4] - '0');
        int count = 0;
        count += corHH - curHH - (corMM >= curMM ? 0 : 1);
        corMM += corMM >= curMM ? 0 : 60;
        int mins = corMM - curMM;
        count += mins / 15;
        mins %= 15;
        count += mins / 5;
        mins %= 5;
        count += mins;

        return count;
    }
}
