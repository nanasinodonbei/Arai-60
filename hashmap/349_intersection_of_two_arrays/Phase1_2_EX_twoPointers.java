import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * InstersectionTwoArrays Solution
 * 
 * ExtraPattern twoPointers
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // O(n log n)
        Arrays.sort(nums2); // O(m log m)

        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;

        // ブルートフォースのフェーズ1がO(n × m)だったのに対し、
        // ソートして両端から詰めたことで O(n + m)となる。
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] == nums2[j]) {
                // ソートしているので、一つ前に格納した値を確認することで重複しているか否かが判断できる
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != nums1[i]) {
                    resultList.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        int index = 0;
        for (int num : resultList) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
