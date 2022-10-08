package com.jchz.leetcode.simple.$0141_环形链表;

import com.jchz.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 13:23
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    public boolean hasCycle_1(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next, slow = head;

        while (fast != slow) {

            if (fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
