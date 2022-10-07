package com.jchz.leetcode.$1360_日期之间隔几天;

import java.util.Calendar;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 13:34
 * @see
 * @since
 */
public class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int startYear = Integer.parseInt(date1.substring(0, 4));
        int startMonth = Integer.parseInt(date1.substring(5, 7));
        int startDay = Integer.parseInt(date1.substring(8, 10));
        int endYear = Integer.parseInt(date2.substring(0, 4));
        int endMonth = Integer.parseInt(date2.substring(5, 7));
        int endDay = Integer.parseInt(date2.substring(8, 10));
        if (date1.compareTo(date2) > 0)
            return daysBetweenDates(date2, date1);
        int sum = 0;
        for (int i = startYear; i < endYear; i++) {
            sum += i % 400 == 0 || (i % 100 != 0 && i % 4 == 0) ? 366 : 365;
        }

        sum += getBeforeDays(endYear, endMonth, endDay);
        sum -= getBeforeDays(startYear, startMonth, startDay);

        return sum;
    }

    int getBeforeDays(int year, int month, int day) {
        int[] days = new int[]{31, year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += days[i];
        }

        return sum + day - 1;
    }
}
