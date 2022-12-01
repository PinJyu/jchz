package com.jchz.leetcode.simple.$剑指Offer0052_两个链表的第一个公共节点;

import com.jchz.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-19 17:23
 */
public class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode Ha = headA, Hb = headB;
        while (Ha != Hb) {
            Ha = Ha == null ? headB : Ha.next;
            Hb = Hb == null ? headA : Hb.next;
        }

        return Ha;
    }

    ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        IdentityHashMap<ListNode, Object> map = new IdentityHashMap<>();
        Object v = new Object();
        while (headA != null || headB != null) {
            if (headA != null && map.put(headA, v) != null)
                return headA;
            if (headB != null && map.put(headB, v) != null)
                return headB;

            if (headA != null)
                headA = headA.next;

            if (headB != null)
                headB = headB.next;
        }

        return null;
    }
}
