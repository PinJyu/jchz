package com.jchz.leetcode.simple.$面试题02_07_链表相交;

import com.jchz.leetcode.structure.ListNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:55
 * @see
 * @since
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha = headA, hb = headB;
        while (headA != null || headB != null) {
            if (headA == headB)
                return headA;
            headA = headA == null ? hb : headA.next;
            headB = headB == null ? ha : headB.next;
        }

        return null;
    }

}
