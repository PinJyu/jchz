package com.jchz.leetcode.$0021_合并两个有序链表;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 15:04
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    // 递归，online_judge stackoverflow
    public ListNode mergeTwoLists_1(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head;

        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        }
        else {
            head = list2;
            list1 = list2.next;
        }

        head.next = mergeTwoLists_1(list1, list2);
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            }
            else {
                prev.next = list2;
                list2 = list2.next;
            }

            prev = prev.next;
        }

        prev.next = list1 != null ? list1 : list2;

        return head.next;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}