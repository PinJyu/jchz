package com.jchz.leetcode.simple.$1773_统计匹配检索规则的物品数量;

import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 17:55
 */
public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0;
        switch (ruleKey) {
            case "type" : ruleIndex = 0; break;
            case "color" : ruleIndex = 1; break;
            case "name" : ruleIndex = 2; break;
        }

        int count = 0;

        for (List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue))
                count++;
        }
        
        return count;
    }
}
