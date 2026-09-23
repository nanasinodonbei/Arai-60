import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum SolutionClass
 *
 * Pattern HashMap
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            // targetから配列の要素の値を引いて補数を算出
            int complement = target - nums[i];

            // hashMapに補数をkeyとし、valueは配列のインデックスをvauleとして格納する
            if (result.containsKey(complement)) {
                // 該当する補数があれば、returnする
                return new int[] { result.get(complement), i };
            } else {
                // 無ければMapに格納する
                result.put(nums[i], i);
            }
        }

        return new int[] { 0, 0 };
    }
}
