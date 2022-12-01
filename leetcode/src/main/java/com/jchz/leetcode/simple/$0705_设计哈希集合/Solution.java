package com.jchz.leetcode.simple.$0705_设计哈希集合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 18:02
 */
public class Solution {
    class MyHashSet {

        List<Integer> list = new ArrayList<>();

        public MyHashSet() {

        }

        public void add(int key) {
            if (!list.contains(key)) {
                list.add(key);
            }
        }

        public void remove(int key) {
            if (list.contains(key)) {
                list.remove((Integer) key);
            }

        }

        public boolean contains(int key) {
            return list.contains(key);
        }
    }
}
