// HashMap (two pass)
// revised the variable names

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_to_index = new HashMap<>(); //val->index
        
        for (int i = 0; i < nums.length; i++) {
            num_to_index.put(nums[i], i); //val->index
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num_to_index.containsKey(complement) && num_to_index.get(complement) != i) {
                return new int[]{i, num_to_index.get(complement)};
            }
            
        }

        return new int[0];
        
    }
}

//T  O(n)
//M  O(n)
