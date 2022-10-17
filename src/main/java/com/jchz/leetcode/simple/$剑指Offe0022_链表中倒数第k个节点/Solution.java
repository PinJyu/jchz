package com.jchz.leetcode.simple.$剑指Offe0022_链表中倒数第k个节点;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 17:43
 */
public class Solution {
    public ListNode getKthFromEnd_1(ListNode head, int k) {
        ListNode f = head, l = head;
        while (f != null && k > 0) {
            f = f.next;
            k--;
        }
        while (f != null) {
            f = f.next;
            l = l.next;
        }

        return l;
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode f = head, l = head;
        int count = 1;
        while (f != null && f.next != null) {
            f = f.next.next;
            l = l.next;
            count++;
        }

        int totalLen = f == null ? (count - 1) * 2 : count * 2 - 1;
        int i = totalLen - k + 1;
        if (i >= count) {
            while (count < i) {
                count++;
                l = l.next;
            }
            return l;
        }
        else {
            for (int j = 1; j < i; j++) {
                head = head.next;
            }
            return head;
        }
    }
}
