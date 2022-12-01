package com.jchz.leetcode.middle.$0086_分隔链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-23 22:29
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyL = new ListNode(1), dummyR = new ListNode(1), tl = dummyL, tr = dummyR;

        while (head != null) {
            if (head.val < x) {
                tl.next = head;
                tl = head;
            }
            else {
                tr.next = head;
                tr = head;
            }
            ListNode next = head.next;
            head.next = null;
            head = next;
        }
        tl.next = dummyR.next;


        return dummyL.next;
    }
}
