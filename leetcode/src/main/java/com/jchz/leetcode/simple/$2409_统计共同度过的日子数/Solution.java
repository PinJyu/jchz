package com.jchz.leetcode.simple.$2409_统计共同度过的日子数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 23:09
 * @see
 * @since
 */
public class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String begin = arriveAlice.compareTo(arriveBob) >= 0 ? arriveAlice : arriveBob;
        String end = leaveAlice.compareTo(leaveBob) >= 0 ? leaveBob : leaveAlice;

        if (begin.compareTo(end) > 0)
            return 0;
        else if (begin.compareTo(end) == 0)
            return 1;
        else {
            int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int beginMonth = Integer.parseInt(begin.substring(0, 2)), beginDay = Integer.parseInt(begin.substring(3, 5));
            int endMonth = Integer.parseInt(end.substring(0, 2)), endDay = Integer.parseInt(end.substring(3, 5));

            int sum = 0;
            for (int i = beginMonth; i < endMonth; i++) {
                sum += monthDays[i - 1];
            }

            sum -= beginDay - 1;
            sum += endDay;

            return sum;
        }
    }

}
