package com.jchz.leetcode.simple.$0706_设计哈希映射;

import javafx.util.Pair;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 17:32
 */
public class Solution {
    class MyHashMap {
        private List[] tab = new List[1000];

        public MyHashMap() {

        }

        public void put(int key, int value) {
            int hash = hashcode(key);
            List list = tab[hash];
            if (list == null) {
                list = new LinkedList();
                tab[hash] =  list;
            }

            remove(key);
            list.add(new Pair(key, value));
        }

        public int get(int key) {
            int hash = hashcode(key);
            List list = tab[hash];
            if (list == null)
                return -1;

            for (Object o : list) {
                Pair p = (Pair) o;
                if (p.getKey().equals(key))
                    return p.getValue() == null ? -1 : (int) p.getValue();
            }

            return -1;
        }

        public void remove(int key) {

            int hash = hashcode(key);
            List list = tab[hash];
            if (list == null)
                return ;

            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {

                Pair p = (Pair) iterator.next();
                if (p.getKey().equals(key))
                    iterator.remove();
            }
        }

        private int hashcode(int key) {
            return key % tab.length;
        }
    }
}
