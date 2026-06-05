// Brute Force
// Input: nums = [2,20,4,10,3,4,5]

class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int streak = 0;
            int curr = num;
            while (store.contains(curr)) {
                streak++;
                curr++;
            }
            result = Math.max(result, streak);
        }
        return result;
    }
}
