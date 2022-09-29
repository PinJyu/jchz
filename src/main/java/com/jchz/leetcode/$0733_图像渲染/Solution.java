package com.jchz.leetcode.$0733_图像渲染;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 11:58
 */
public class Solution {
    // r -> l -> r, sign r don't re. stackoverflow
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        dfs(image, sr, sc, image[sr][sc]);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == -1)
                    image[i][j] = color;
            }
        }

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int initColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != initColor)
            return;

        image[sr][sc] = -1;
        dfs(image, sr + 1, sc, initColor);
        dfs(image, sr - 1, sc, initColor);
        dfs(image, sr, sc + 1, initColor);
        dfs(image, sr, sc - 1, initColor);
    }

    public static void main(String[] args) {
        int[][] image = new int[2][3];
        image[0] = new int[]{0, 0, 0};
        image[1] = new int[]{0, 1, 0};
        new Solution().floodFill_1(image, 1, 1, 2);
    }
    public int[][] floodFill_1(int[][] image, int sr, int sc, int color) {
        int initColor = image[sr][sc];
        final int c_ = color;
        color = -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});

        while (!q.isEmpty()) {
            int[] point = q.poll();
            int x = point[0], y = point[1];
            image[x][y] = color;
            updateAround(image, x, y, initColor, color, q);
        }


        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == -1)
                    image[i][j] = c_;
            }
        }
        return image;
    }


    private void updateAround(int[][] image, int x, int y, int initColor, int color, Queue<int[]> q) {
        if (updateColor(image, x - 1, y, initColor, color))
            q.offer(new int[]{x - 1, y});
        if (updateColor(image, x + 1, y, initColor, color))
            q.offer(new int[]{x + 1, y});
        if (updateColor(image, x, y - 1, initColor, color))
            q.offer(new int[]{x, y - 1});
        if (updateColor(image, x, y + 1, initColor, color))
            q.offer(new int[]{x, y + 1});
    }
    private boolean updateColor(int[][] image, int x, int y, int initColor, int color) {
        if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == initColor) {
            image[x][y] = color;
            return true;
        }

        return false;
    }
}
