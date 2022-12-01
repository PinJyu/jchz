package com.jchz.leetcode.middle.$0002_两数相加;

import com.jchz.leetcode.structure.ListNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-23 21:23
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(1), tail = dummyHead;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum %= 10;

            tail.next = new ListNode(sum);
            tail = tail.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
