package com.jchz.leetcode.simple.$面试题02_01_移除重复节点;

import com.jchz.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:26
 * @see
 * @since
 */
public class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode h = head, prev = null;
        while (head != null) {
            if (!set.add(head.val)) {
                prev.next = head.next;
                head.next = null;
                head = prev;
            }
            prev = head;
            head = head.next;
        }

        return h;
    }

}
