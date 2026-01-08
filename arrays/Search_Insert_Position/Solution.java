// Problem: Search Insert Position
// LeetCode: https://leetcode.com/problems/search-insert-position/
// Difficulty: Easy
// Topic: Arrays , Binary Search


package arrays.Search_Insert_Position;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int position=-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
                position=mid;
            }else{
                left=mid+1;
                position=mid+1;
            }
        }
        return position;
    }
}
