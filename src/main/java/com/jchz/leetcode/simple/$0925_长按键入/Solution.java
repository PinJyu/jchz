package com.jchz.leetcode.simple.$0925_长按键入;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 18:40
 */
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] cs = typed.toCharArray();
        Character last = null;
        int nextIndex = 0;
        for (char c : name.toCharArray()) {

            boolean mis = true;
            for (int i = nextIndex; i < typed.length(); i++) {
                if (cs[i] == c) {
                    last = c;
                    nextIndex = i + 1;
                    mis = false;
                    break;
                }
                else if (last == null)
                {
                    return false;
                }
                else if (cs[i] == last) {
                    continue;
                }
                else
                    return false;
            }
            if (mis)
                return false;
        }

        for (int i = nextIndex; i < typed.length(); i++) {
            if (cs[i] != last) {
                return false;
            }
        }

        return true;

    }

}
