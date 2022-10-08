package com.jchz.leetcode.simple.$1598_文件夹操作日志搜集器_模拟;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 14:21
 */
public class Solution {

    // 直接模拟题
    public int minOperations(String[] logs) {
        int deep = 0;
        for (int i = 0; i < logs.length; i++) {
            String operate = logs[i];
            switch (operate) {
                case "./"   : break;
                case "../"  : deep--; if (deep < 0) deep = 0; break;
                default     : deep++;
            }
        }

        return deep;
    }
}
