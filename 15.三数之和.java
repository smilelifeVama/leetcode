import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 *
 * https://leetcode-cn.com/problems/3sum/description/
 *
 * algorithms
 * Medium (25.17%)
 * Likes:    1730
 * Dislikes: 0
 * Total Accepted:    146.5K
 * Total Submissions: 581.6K
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * ？找出所有满足条件且不重复的三元组。
 * 
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 
 * 
 * 示例：
 * 
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 
 * 满足要求的三元组集合为：
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resList = new ArrayList<>();
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];
            maps.clear();
            for (int j = i + 1; j < nums.length; j++) {
                int needValue = target - nums[j];
                if (maps.containsKey(needValue)) {
                    resList.add(new ArrayList<Integer>(Arrays.asList(needValue, nums[j], nums[i])));
                }else {
                    maps.put(nums[j], j);
                }
            }
        }
        return resList;
    }
}
// @lc code=end

