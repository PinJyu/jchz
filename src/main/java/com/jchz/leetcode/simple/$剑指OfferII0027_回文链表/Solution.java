package com.jchz.leetcode.simple.$剑指OfferII0027_回文链表;

import com.jchz.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 16:36
 * @see
 * @since
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead= reverse(slow.next), prev = newHead;


        while (prev != null) {
            if (prev.val != head.val) {
                slow.next = reverse(newHead);
                return false;
            }
            prev = prev.next;
            head = head.next;
        }

        slow.next = reverse(newHead);

        return true;
    }

    ListNode reverse(ListNode head) {
        ListNode cur = head, prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    ListNode f;
    public boolean isPalindrome_2(ListNode head) {
        f = head;
        return recursiveCheck(head);
    }

    boolean recursiveCheck(ListNode cur) {
        if (cur == null)
            return true;

        if (!recursiveCheck(cur.next))
            return false;

        if (f.val != cur.val)
            return false;

        f = f.next;

        return true;
    }

    public boolean isPalindrome_1(ListNode head) {
        List<Integer> li = new ArrayList<>();

        while (head != null) {
            li.add(head.val);
            head = head.next;
        }

        int l = 0, r = li.size() - 1;
        while (l < r) {
            if (li.get(l++).intValue() !=  li.get(r++).intValue())
                return false;
        }

        return true;
    }

}
