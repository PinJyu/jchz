package com.jchz.leetcode.simple.$1700_无法吃午餐的学生数量;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 12:22
 */
public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> stuQ = new LinkedList<>();
        for (int i : students) {
            stuQ.offer(i);
        }
        int top = 0;
        while (top < sandwiches.length) {
            int c = 1;
            while (sandwiches[top] != stuQ.peek() && c < stuQ.size()) {
                stuQ.offer(stuQ.poll());
                c++;
            }
            if (sandwiches[top] != stuQ.peek())
                return stuQ.size();
            else {

                stuQ.poll();
                top++;
            }
        }

        return 0;
    }
}
