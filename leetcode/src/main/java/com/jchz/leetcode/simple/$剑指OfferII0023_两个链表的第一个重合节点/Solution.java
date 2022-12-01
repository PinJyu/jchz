package com.jchz.leetcode.simple.$剑指OfferII0023_两个链表的第一个重合节点;

import com.jchz.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 17:45
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyA = headA, dummyB = headB;
        while (headA != headB) {
            headA = headA == null ? dummyB : headA.next;
            headB = headB == null ? dummyA : headB.next;
        }

        return null;
    }

    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                if (!set.add(headA))
                    return headA;
                headA = headA.next;
            }
            if (headB != null) {
                if (!set.add(headB))
                    return headB;
                headB = headB.next;
            }
        }

        return null;
    }
}
