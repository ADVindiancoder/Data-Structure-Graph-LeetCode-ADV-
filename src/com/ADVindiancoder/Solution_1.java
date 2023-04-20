package com.ADVindiancoder;

public class Solution_1 {
    public static void main(String[] args) {
        Solution solution12 = new Solution();
        int[] nums = {1, 2, 2, 3, 3, 1, 4};
        int result = solution12.singleNumber(nums);
        System.out.println(result);
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
