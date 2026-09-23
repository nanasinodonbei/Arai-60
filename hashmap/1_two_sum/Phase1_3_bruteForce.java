/**
 * TwoSum Solution
 * 
 * Pattern BruteForce
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                int total = nums[i] + nums[j];

                if (target == total)
                    return new int[] { i, j };
            }
        }
        
        return new int[] { 0, 0 };
    }
}
