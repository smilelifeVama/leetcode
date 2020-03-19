/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = (j - i) * (height[i] < height[j] ? height[i] : height[j]);
        while(i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            int h = (height[i] < height[j] ? height[i]: height[j]);
            res = Math.max(res, h * (j - i));
        }
        return res;
    }
}
// @lc code=end

