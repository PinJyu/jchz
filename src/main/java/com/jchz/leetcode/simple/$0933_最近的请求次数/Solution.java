package com.jchz.leetcode.simple.$0933_最近的请求次数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 19:45
 */
public class Solution {
    class RecentCounter {

        List<Integer> requests = new ArrayList<>();

        public RecentCounter() {

        }

        public int ping(int t) {
            final int s = t - 3000, e = t;
           int count = 0;
            requests.add(e);
            for (int i = requests.size() - 1; i >= 0; i++) {
                Integer r = requests.get(i);
                if (r >= s && r <= e)
                    count++;
                else
                    break;
            }

            return count;
        }
    }
}
