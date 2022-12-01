package com.jchz.leetcode.middle.$0061_旋转链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-23 22:11
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummyNode = new ListNode(1), slow = dummyNode, fast = head, c = head;
        dummyNode.next = head;
        int count = 0;

        while (c != null) {
            count++;
            c = c.next;
        }
        if (head == null || count == 0 || (k %= count) == 0 || head.next == null)
            return head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode tail = slow;
        slow = slow.next;
        tail.next = null;
        fast.next = head;

        return slow;
    }
}
