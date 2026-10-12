import java.util.Set;
import java.util.HashSet;

class Solution {

    public int[] intersectionTwoArrays(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for (int num : nums1) {
            nums1Set.add(num);
        }

        Set<Integer> inspectionSet = new HashSet<>();
        for (int num : nums2) {
            if (nums1Set.contains(num)) {
                inspectionSet.add(num);
            }
        }

        int[] inspectionResult = new int[inspectionSet.size()];
        int index = 0;
        for (int num : inspectionSet) {
            inspectionResult[index] = num;
            index++;
        }

        return inspectionResult;
    }
}