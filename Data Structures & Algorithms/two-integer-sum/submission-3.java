// HashMap (One pass)
// revised the variable names

class Solution {
    public int[] twoSum(int[] nums, int target) {        
        Map<Integer, Integer> seenNumToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (seenNumToIndex.containsKey(complement)) {
                return new int[] {seenNumToIndex.get(complement), i };
            }

            seenNumToIndex.put(num, i);
        }

        return new int[] {};

    }
}

//T  O(n)
//M  O(n)
