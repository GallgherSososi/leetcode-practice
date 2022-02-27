package com.sososi;

import java.util.HashMap;

public class TwoSum {

    /**
     * 暴力枚举方式
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = i+ 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    /**
     *  hash哈希表方式
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(target - nums[i])) {
                return new int[]{i, res.get(target - nums[i])};
            }
            res.put(nums[i], i);
        }
        return new int[0];
    }
}
