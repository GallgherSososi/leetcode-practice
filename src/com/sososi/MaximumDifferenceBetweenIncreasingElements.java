package com.sososi;

/**
 * 2016. 增量元素之间的最大差值
 * 给你一个下标从 0 开始的整数数组 nums ，该数组的大小为 n ，请你计算 nums[j] - nums[i] 能求得的 最大差值 ，其中 0 <= i < j < n 且 nums[i] < nums[j] 。
 *
 * 返回 最大差值 。如果不存在满足要求的 i 和 j ，返回 -1 。
 *
 */
public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int n = nums.length, ans = -1;
        for (int i = 1, min = nums[0]; i < n; i++) {
            if (nums[i] > min) ans = Math.max(nums[i] - min, ans);
            if (nums[i] <= min) min = nums[i];
        }
        return ans;
    }
}
