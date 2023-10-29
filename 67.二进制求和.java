/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode.cn/problems/add-binary/description/
 *
 * algorithms
 * Easy (52.99%)
 * Likes:    1051
 * Dislikes: 0
 * Total Accepted:    331.9K
 * Total Submissions: 626.6K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入:a = "11", b = "1"
 * 输出："100"
 * 
 * 示例 2：
 * 
 * 
 * 输入：a = "1010", b = "1011"
 * 输出："10101"
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= a.length, b.length <= 10^4
 * a 和 b 仅由字符 '0' 或 '1' 组成
 * 字符串如果不是 "0" ，就不含前导零
 * 
 * 
 */

// @lc code=start
class Solution {
    
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0 ? a.charAt(i) - '0' : 0);
            int digitB = (j >= 0 ? b.charAt(j) - '0' : 0);
            int sum = digitA + digitB + carry;
            carry = sum >= 2 ? 1 : 0;
            int value = (carry == 1 ? sum - 2 : sum);
            stringBuilder.append(value);
            i --;
            j --;
        }
        return stringBuilder.reverse().toString();
    }
}
// @lc code=end

