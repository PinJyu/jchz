package com.jchz.leetcode.simple.$剑指Offer0006_从尾到头打印链表;

import com.jchz.leetcode.structure.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 17:03
 * @see
 * @since
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();

        while (head != null) {
            deque.push(head.val);
            head = head.next;
        }

        int[] ret = new int[deque.size()];
        int index = 0;
        while (!deque.isEmpty())
            ret[index++] = deque.pop();

        return ret;
    }

}
