package com.jchz.leetcode.middle.$0109_有序链表转换二叉搜索树;

import com.jchz.leetcode.structure.ListNode;
import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 16:39
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);

        ListNode slow = head, fast = head, tail = null;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            tail = slow;
            slow = slow.next;
        }
        if (tail != null) {
            tail.next = null;
        }

        TreeNode root = new TreeNode(slow.val);
        if (tail !=  null) {
            root.left = sortedListToBST(head);
        }
        root.right = sortedListToBST(slow.next);

        return root;

    }

}
