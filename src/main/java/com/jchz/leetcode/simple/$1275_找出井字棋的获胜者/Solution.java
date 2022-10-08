package com.jchz.leetcode.simple.$1275_找出井字棋的获胜者;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 18:02
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().tictactoe(new int[][]{{0,0},{2,2},{1,0},{2,0},{0,1},{1,2},{1,1},{0,2}});
    }
    public String tictactoe(int[][] moves) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < moves.length; i++) {
            map.put(moves[i][0] * 3 + moves[i][1], i % 2 == 0 ? 1 : -1);
        }
        for (int i = 0; i < 3; i++) {
            if (map.containsKey(i * 3) && map.containsKey(i * 3 + 1) && map.containsKey(i * 3 + 2)) {
                boolean cmp = cmp(map.get(i * 3), map.get(i * 3 + 1), map.get(i * 3 + 2));
                if (cmp)
                    return map.get(i * 3) == 1 ? "A" : "B";
            }
            if (map.containsKey(i + 0) && map.containsKey(i + 6) && map.containsKey(i + 3)) {
                boolean cmp = cmp(map.get(i + 0), map.get(i + 3), map.get(i + 6));
                if (cmp)
                    return map.get(i + 3) == 1 ? "A" : "B";
            }
        }

        if (map.containsKey(0) && map.containsKey(4) && map.containsKey(8)) {
            boolean cmp = cmp(map.get(0), map.get(4), map.get(8));
            if (cmp)
                return map.get(4) == 1 ? "A" : "B";
        }
        if (map.containsKey(2) && map.containsKey(4) && map.containsKey(6)) {
            boolean cmp = cmp(map.get(2), map.get(4), map.get(6));
            if (cmp)
                return map.get(4) == 1 ? "A" : "B";
        }

        return map.size() == 9 ? "Draw" : "Pending";

    }

    public boolean cmp(int a, int b, int c) {
        return a == b && b == c;
    }
}
