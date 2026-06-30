// Brute Force・first thought

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < result) {
                result = nums[i];
            } 
        }
        return result;
    }
}
