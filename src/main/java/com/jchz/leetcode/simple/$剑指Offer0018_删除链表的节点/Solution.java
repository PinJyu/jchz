package com.jchz.leetcode.simple.$剑指Offer0018_删除链表的节点;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 17:24
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode hp = head, pre = null;

        while (hp != null) {
            if (hp.val == val) {
                if (pre == null) {
                    head = hp.next;
                }
                else {
                    pre.next = hp.next;
                }

                break;
            }

            pre = hp;
            hp = hp.next;
        }

        return head;
    }
}
