package com.jchz.leetcode.$1114_按序打印;

import java.nio.file.attribute.UserPrincipalNotFoundException;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 19:30
 */
public class Solution {
    class Foo {

        volatile boolean firstAck = false;
        volatile boolean secondAck = false;
        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstAck = true;
        }

        public void second(Runnable printSecond) throws InterruptedException {

            while (!firstAck) {

            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            secondAck = true;
        }

        public void third(Runnable printThird) throws InterruptedException {

            while (!secondAck) {
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
