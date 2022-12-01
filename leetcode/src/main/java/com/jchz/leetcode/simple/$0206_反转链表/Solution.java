package com.jchz.leetcode.simple.$0206_反转链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 15:21
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, n, res = null;
        while (cur != null) {
            n = cur.next;
            if (n != null) {
                head = n.next;
                n.next = cur;
                cur.next = res;
                res = n;
                cur = head;
            }
            else {
                cur.next = res;
                res = cur;
                cur = null;
            }
        }

        return res;
    }

    public ListNode reverseList_1(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
