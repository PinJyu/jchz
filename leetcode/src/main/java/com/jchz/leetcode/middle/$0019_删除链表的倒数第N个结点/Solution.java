package com.jchz.leetcode.middle.$0019_删除链表的倒数第N个结点;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-23 21:47
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int fastindex= 1, slowindex = 1;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            slowindex++;
            fast = fast.next.next;
            fastindex += 2;
        }

        if (fast == null) {
            fastindex--;
        }

        int removeindex = fastindex + 1 - n, startindex = 1;
        ListNode prev = null, startNode = head;
        if (removeindex > slowindex) {
            startindex = slowindex;
            startNode = slow;
        }
        // System.out.printf("%d, %d", removeindex, startindex);

        for (int i = startindex; i < removeindex; i++) {
            prev = startNode;
            startNode = startNode.next;
        }

        if (prev == null) {
            head = startNode.next;
            startNode.next = null;
        }
        else {
            prev.next = startNode.next;
            startNode.next = null;
        }


        return head;
    }
}
