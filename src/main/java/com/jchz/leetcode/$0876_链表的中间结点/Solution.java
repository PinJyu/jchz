package com.jchz.leetcode.$0876_链表的中间结点;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 15:27
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode f = head.next, l = head;
        while (f != null) {

            f = f.next == null ? null : f.next.next;
            l = l.next;
        }

        return l;
    }
}
