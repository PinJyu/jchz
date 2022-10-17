package com.jchz.leetcode.simple.$剑指Offer0025_合并两个排序的链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 18:29
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        tail.next = l1 == null ? l2 : l1;

        return dummy.next;
    }
}
