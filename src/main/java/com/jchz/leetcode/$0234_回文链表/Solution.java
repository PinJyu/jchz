package com.jchz.leetcode.$0234_回文链表;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-15 16:25
 */
public class Solution {

    ListNode frontNode;
    public boolean isPalindrome(ListNode head) {
        frontNode = head;
        return dfs(head);
    }

    // 自下向上
    public boolean dfs(ListNode node) {
        // 遍历到叶子节点
        if (node != null) {
            if (!dfs(node.next)) {
                return false;
            }

            boolean result = frontNode.val == node.val;
            frontNode = frontNode.next;

            return result;
        }

        return true; // 叶子节点不影响判断
    }

    // 快慢指针，反转链表后半部分
    public boolean isPalindrome_1(ListNode head) {
        if (head.next == null)
            return true;

        ListNode f = head.next, s = head, tail = new ListNode(-1), otherHead;

        while (f.next != null) {
            f = f.next.next == null ? f.next : f.next.next;
            s = s.next;
        }

        otherHead = reverse(s.next);
        s.next = null;

        while (head != null && otherHead != null) {
            if (head.val != otherHead.val) {
                return false;
            }

            if (head.next == null || otherHead.next == null) {
                break;
            }

            head = head.next;
            otherHead = otherHead.next;
        }

        return true;
    }


    public ListNode reverse(ListNode head) {
        ListNode res = null, cur = null;
        while (head != null) {
            cur = head.next;
            head.next = res;
            res = head;
            head = cur;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print('\u6211');
    }
}
