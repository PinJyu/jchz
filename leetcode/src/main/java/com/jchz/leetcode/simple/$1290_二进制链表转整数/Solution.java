package com.jchz.leetcode.simple.$1290_二进制链表转整数;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 19:31
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret = (ret << 1) | head.val;
            head = head.next;
        }

        return ret;
    }
}
