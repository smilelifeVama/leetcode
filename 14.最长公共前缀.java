/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String commPrefix = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    return commPrefix;
                }
            }
            commPrefix = prefix;
        }
        return commPrefix;
    }
}
// @lc code=end

