package com.jchz.leetcode.simple.$0160_相交链表;

import com.jchz.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 23:44
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                if (!set.add(headA)) return headA;
                headA = headA.next;
            }
            if (headB != null) {
                if (!set.add(headB)) return headB;
                headB = headB.next;
            }
        }

        return null;
    }

    // A = a + c, B = b + c, common = a + b + c
    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        ListNode curA = headA, curB = headB;
        if (curA == null || curB == null) return null;

        while (curA != curB) {
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }

        return curA;
    }
}

