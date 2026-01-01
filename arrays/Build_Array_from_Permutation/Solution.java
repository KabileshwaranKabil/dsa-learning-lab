// Problem: Build Array from Permutation
// LeetCode: https://leetcode.com/problems/build-array-from-permutation/
// Difficulty: Easy
// Topic: Arrays
// Pattern: Index mapping
package arrays.Build_Array_from_Permutation;
class Solution {
    public int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<result.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }
}
