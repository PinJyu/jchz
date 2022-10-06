package com.jchz.leetcode.$1337_矩阵中战斗力最弱的K行;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 22:06
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().kWeakestRows(new int[][]{{1,0},{1,0},{1,0},{1,1}}, 4);
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] map = new int[mat[0].length + 1][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    map[j][i] = 1;
                    break;
                }
                else if (j == mat[0].length - 1 && mat[i][j] == 1) {
                    map[j + 1][i] = 1;
                    break;
                }
            }
        }


        int[] res = new int[k];
        int index = 0;
    outter:
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1)
                    res[index++] = j;

                if (index == k)
                    break outter;
            }
        }

        return res;
    }
}
