package com.jchz.leetcode.$0606_根据二叉树创建字符串;

import com.jchz.leetcode.structure.TreeNode;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 18:37
 */
public class Solution {
    public String tree2str(TreeNode root) {

        if (root == null) {
            return "";
        }

        String res = "";

        res += root.val ;
        String sl = tree2str(root.left);
        String sr = tree2str(root.right);
        if (!"".equals(sr)) {
            res += "(" + sl + ")";
            res += "(" + sr + ")";
        }
        else {
            if (!"".equals(sl)) {
                res += "(" + sl + ")";
            }
        }

        return res;

    }


}
