/** TwoSum SolutionClass 
 * 
 * Pattarn BruteForce
*/
class Solution {

    public int[] twoSum(int[] nums, int target) {

        // 配列内の基準となる数字を指定
        for(int i = 0; i < nums.length -1; ++i) {
        
             // 配列内の基準となる数字に足し合わせる、配列内の数字を指定
             for (int j = i +1; j < nums.length; ++j) {
                
                //配列内の要素を加算
                int total = nums[i] + nums[j];

                if (target == total) return new int []{i, j};
             }
        }

    return new int[]{0,0};
    }
}


