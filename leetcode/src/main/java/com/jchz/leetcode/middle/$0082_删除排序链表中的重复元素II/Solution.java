package com.jchz.leetcode.middle.$0082_删除排序链表中的重复元素II;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-23 22:21
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head, dummyHead = new ListNode(1), prev = dummyHead;
        while (cur != null) {
            ListNode next = cur.next;
            while (next != null && next.val == cur.val) {
                next = next.next;
            }
            if (cur.next == next) {
                cur.next = null;
                prev.next = cur;
                prev = cur;
            }

            cur = next;

        }

        return dummyHead.next;
    }
}
