/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    // 1.先计算宽度最大时，第一组面积
    // 2.缩小高度较低的那一侧，如果当前最小高度大于之前的最小高度才需要计算最新的面积
    // 3.直到左右指针会合
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int minHeight = Math.min(height[left], height[right]);
        int max = (right - left) * Math.min(height[left], height[right]);
        while (left < right) {
            int cHeight = height[left] < height[right] ? height[++ left] : height[-- right];
            if (cHeight > minHeight) {//高度增加
                minHeight = Math.min(height[left], height[right]);
                max = Math.max(max, (right - left) * minHeight);
            }
        }
        return max;
    }
}
// @lc code=end

