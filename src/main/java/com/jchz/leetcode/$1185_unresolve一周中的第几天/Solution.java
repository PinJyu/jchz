package com.jchz.leetcode.$1185_unresolve一周中的第几天;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 22:33
 */
public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        return "";
    }

    public int dayOfYear(int day, int month, int year) {
        int sum = 0;
        for (int i = 1; i < month + 1; i++) {
            if (i == month) {
                sum += day;
            }
            else {
                int days = 0;
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        days = 31;
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        days = 30;
                        break;
                    }
                    default: {
                        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                            days = 29;
                        }
                        else {
                            days = 28;
                        }
                    }
                }
                sum += days;
            }
        }

        return sum;
    }
}
