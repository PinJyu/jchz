package com.jchz.leetcode.simple.$面试题02_02_返回倒数第k个节点;

import com.jchz.leetcode.structure.ListNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:34
 * @see
 * @since
 */
public class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head, low = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            low = low.next;
        }

        return low.val;
    }

    public int kthToLast_1(ListNode head, int k) {
        ListNode newHead = reverse(head);
        for (int i = 0; i < k - 1; i++) {
            newHead = newHead.next;
        }

        return newHead.val;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null, next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

}
