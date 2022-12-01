package com.jchz.leetcode.middle.$0024_两两交换链表中的节点;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-23 21:54
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        ListNode dummyHead = new ListNode(1), prev = dummyHead;
        dummyHead.next = head;
        while (cur != null) {
            ListNode l = cur, r = cur.next;
            if (r != null) {
                prev.next = r;
                ListNode t = r.next;
                r.next = l;
                l.next = t;
                cur = t;
                prev = l;
            }
            else {
                cur = null;
            }
        }

        return dummyHead.next;
    }
}
