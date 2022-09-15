package com.jchz.leetcode.$0205_同构字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 14:41
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> O2Imap = new HashMap<>();
        Map<Character, Character> I2Omap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char originalImage = s.charAt(i);
            char image = t.charAt(i);

            Character im = O2Imap.get(originalImage);
            if (im == null) {
                O2Imap.put(originalImage, image);
            }
            else if (image != im) {
                return false;
            }

            Character oi = I2Omap.get(image);
            if (oi == null) {
                I2Omap.put(image, originalImage);
            }
            else if (oi != originalImage) {
                return false;
            }
        }

        return true;
    }
}
