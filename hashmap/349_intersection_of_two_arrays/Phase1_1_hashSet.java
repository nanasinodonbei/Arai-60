import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/**
 * InstersectionTwoArrays Solution
 * 
 * Pattern HashSet
 */
class Solution {
    public int[] intersectionTwoArrays(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : set2) {
            if (set1.contains(num)) {
                resultList.add(num);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); ++i) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
