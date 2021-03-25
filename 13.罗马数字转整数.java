/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = '0';
            if (i < s.length() - 1) {
                c1 = s.charAt(i + 1);
            }
            int cNum = getVal(c);
            int c1Num = getVal(c1);
            if (cNum < c1Num) {
                result -= cNum;
            } else {
                result += cNum;
            }
        }
        return result;
    }

    private int getVal(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
        }
        return 0;
    }
}
// @lc code=end

