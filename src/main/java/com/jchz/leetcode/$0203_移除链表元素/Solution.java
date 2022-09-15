package com.jchz.leetcode.$0203_移除链表元素;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 14:18
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode noneHead = new ListNode(-1);
        noneHead.next = head;
        ListNode cur = head;
        ListNode pre = noneHead;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }
            else {
                pre = cur;
            }
            cur = cur.next;
        }

        return noneHead.next;
    }

    public ListNode removeElements_1(ListNode head, int val) {
        if (head == null) return null;

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

}
