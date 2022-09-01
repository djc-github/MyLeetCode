package com.djc;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 邓金昌
 * @Date 2022/9/1 20:40
 * @Version 1.0
 * @Description 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * 提示：
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 *
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 */
public class twoSum {
//我的方法
    class Solution {
    //我的方法
        public int[] twoSum1(int[] nums, int target) {
            int[] r = new int[2];
            for(int i = nums.length-1;i>-1;--i) {
                for(int j = i-1;j>-1;--j){
                    if(nums[i]+nums[j]==target){
                        r[0] = i;
                        r[1] = j;
                    }
                }
            }
            return r;
        }

    //官方题解 暴力枚举
    //复杂度分析
    //时间复杂度：O(N^2)其中 N 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
    //空间复杂度：O(1)。
    public int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //官方题解 哈希表
    //复杂度分析
    //时间复杂度：O(N)，其中 N 是数组中的元素数量。对于每一个元素 x，我们可以 O(1)O(1) 地寻找 target - x。
    //空间复杂度：O(N)，其中 N 是数组中的元素数量。主要为哈希表的开销。
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    }
}