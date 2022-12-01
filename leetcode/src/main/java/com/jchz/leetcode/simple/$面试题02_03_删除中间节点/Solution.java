package com.jchz.leetcode.simple.$面试题02_03_删除中间节点;

import com.jchz.leetcode.structure.ListNode;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:45
 * @see
 * @since
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
