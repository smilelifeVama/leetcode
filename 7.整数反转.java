/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (33.52%)
 * Likes:    2084
 * Dislikes: 0
 * Total Accepted:    422.8K
 * Total Submissions: 1.2M
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int temp = 0;
        int result = 0;
        while (x != 0) {
            temp = x % 10;//取个位数
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10) {
                System.out.println("1 result = " + result);
                return 0;
            }
            if (result == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10) {
                System.out.println("2 result = " + result);
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10) {
                System.out.println("3 result = " + result);
                return 0;
            }
            if (result == Integer.MIN_VALUE / 10 && temp < Integer.MIN_VALUE % 10) {
                System.out.println("4 result = " + result);
                return 0;
            }
            result = result * 10 + temp;
        }
        return result;
    }
}
// @lc code=end

