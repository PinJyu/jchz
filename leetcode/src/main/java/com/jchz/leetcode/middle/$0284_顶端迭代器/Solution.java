package com.jchz.leetcode.middle.$0284_顶端迭代器;

import java.util.Iterator;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-03 19:26
 */
public class Solution {
    // Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

    class PeekingIterator implements Iterator<Integer> {
        Iterator<Integer> iterator;
        Integer next;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            if (this.iterator.hasNext()) {
                next = this.iterator.next();
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer ret = next;
            next = null;
            if (this.iterator.hasNext()) {
                next = this.iterator.next();
            }

            return ret;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }
}
