import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/**
 * InstersectionTwoArrays Solution
 * 
 * ExtraPattern binarySearch
 */
class Solution {
    public int[] intersectionTwoArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Set<Integer> Set = new HashSet();
        for (int num : nums1) {
            if (Arrays.binarySearch(nums2, num) >= 0) {
                Set.add(num);
            }
        }

        int[] resultArray = new int[Set.size()];
        int index = 0;
        for (int num : Set) {
            resultArray[index] = num;
            index++;
        }

        return resultArray;
    }
}
