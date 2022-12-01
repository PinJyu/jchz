package com.jchz.leetcode.simple.$剑指Offer0024_反转链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 18:20
 */
public class Solution {
    public ListNode reverseList_1(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1), dummyNext;
        while (head != null) {
            dummyNext = dummy.next;
            dummy.next = head;
            head = head.next;
            dummy.next.next = dummyNext;
        }

        return dummy.next;
    }
}
