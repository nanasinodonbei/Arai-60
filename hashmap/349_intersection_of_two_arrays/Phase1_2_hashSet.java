import java.util.HashSet;
import java.util.Set;

/**
 * InstersectionTwoArrays Solution
 * 
 * ExtraPattern HashSet
 */
class Solution {
    public int[] intersectionTwoArrays(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for (int num : nums1) {
            nums1Set.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (nums1Set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] intersectionResult = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionResult[index] = num;
            index++;
        }

        return intersectionResult;
    }
}
