package com.jchz.leetcode.simple.$面试题02_06_回文链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:50
 * @see
 * @since
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newH = reverse(slow.next);
        while (head != null && newH != null) {
            if (head.val != newH.val)
                return false;
            head = head.next;
            newH = newH.next;
        }

        return true;
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
