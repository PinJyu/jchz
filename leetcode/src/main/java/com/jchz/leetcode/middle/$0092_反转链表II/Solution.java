package com.jchz.leetcode.middle.$0092_反转链表II;

import com.jchz.leetcode.structure.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 16:21
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Deque<ListNode> s = new LinkedList<>();

        ListNode h = null, tail = null, dummyH = new ListNode(1), t = null, dummyT = new ListNode(1);
        dummyH.next = head;
        h = dummyH;
        int index = 0;
        while (h != null && index < left - 1) {
            h = h.next;
            index++;
        }

        t = h.next;
        index++;
        tail = t;
        while (t != null && index <= right) {
            ListNode n = t.next;
            index++;
            ListNode dn = dummyT.next;
            dummyT.next = t;
            t.next = dn;
            t = n;
        }

        tail.next = t;
        h.next = dummyT.next;
        return dummyH.next;





    }
}
