import java.util.ArrayList;
import java.util.List;

/**
 * InstersectionTwoArrays Solution
 * 
 * Pattern BruteForce
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersectionValues = new ArrayList<>();
        // 外側のfor文で基準となるnums1[]の要素を決める
        for (int candidateIndex = 0; candidateIndex < nums1.length; ++candidateIndex) {
            int candidate = nums1[candidateIndex];
            // 内側のfor文で比較する配列の要素を指定する
            for (int compareIndex = 0; compareIndex < nums2.length; ++compareIndex) {
                // 基準値をnums2の要素と比較する
                if (candidate == nums2[compareIndex]) {
                    // 重複の有無
                    boolean alreadyFound = false;
                    // 既に追加済みの値があるかをチェックする
                    for (int foundIndex = 0; foundIndex < intersectionValues.size(); ++foundIndex) {
                        if (intersectionValues.get(foundIndex) == candidate) {
                            alreadyFound = true;
                            break;
                        }
                    }
                    // 重複する値がない場合、要素の値を追加する
                    if (!alreadyFound) {
                        intersectionValues.add(candidate);
                        break;
                    }
                }
            }
        }

        int[] intersectionArray = new int[intersectionValues.size()];
        int copyIndex = 0;
        // 一致した値を配列に詰める 
        for (int value : intersectionValues) {
            intersectionArray[copyIndex] = value;
            copyIndex++;
        }

        return intersectionArray;
    }
}
