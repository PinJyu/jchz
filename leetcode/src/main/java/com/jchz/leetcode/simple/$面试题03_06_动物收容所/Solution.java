package com.jchz.leetcode.simple.$面试题03_06_动物收容所;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 17:37
 * @see
 * @since
 */
public class Solution {
    class AnimalShelf {
        Deque<int[]> dog = new LinkedList<>();
        Deque<int[]> cat = new LinkedList<>();
        public AnimalShelf() {

        }

        public void enqueue(int[] animal) {
            if (animal[1] == 0)
                cat.offer(animal);
            else
                dog.offer(animal);
        }

        public int[] dequeueAny() {
            int[] dog = this.dog.peek();
            int[] cat = this.cat.peek();
            if (dog == null && cat == null)
                return new int[]{-1, -1};
            else if (dog == null)
                return this.cat.poll();
            else if (cat == null)
                return this.dog.poll();
            else {
                return dog[0] > cat[0] ? this.cat.poll() : this.dog.poll();
            }
        }

        public int[] dequeueDog() {
            int[] poll = dog.poll();
            return poll == null ? new int[]{-1, -1} : poll;
        }

        public int[] dequeueCat() {
            int[] poll = cat.poll();
            return poll == null ? new int[]{-1, -1} : poll;
        }
    }

}
