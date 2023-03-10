package leetcode.N1;

import java.util.HashMap;
import java.util.Map;

// 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];

            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }

            map.put(diff, i);
        }
        return new int[] {0, 0};
    }
}