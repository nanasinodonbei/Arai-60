import java.util.List;
import java.util.ArrayList;

/**
 * InstersectionTwoArrays Solution
 * 
 * Pattern BruteForce
 */
class Solution {

    public int[] instersectionTwoArrays(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        // 外側のfor文で基準となるnum1[]の要素を決める
        for (int i = 0; i < nums1.length; ++i) {
            // 内側のfor文で比較する配列の要素を指定する
            for (int j = 0; j < nums2.length; ++j) {
                // 基準値をnums2の要素と比較する。
                if (nums1[i] == nums2[j]) {
                    // 重複の有無
                    boolean isDuplicate = false;

                    // 既に追加済みの値があるかをチェックする
                    for (int k = 0; k < result.size(); ++k) {
                        if (result.get(k) == nums1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    // 重複する値がない場合、要素の値を追加する
                    if (!isDuplicate) {
                        result.add(nums1[i]);
                    }
                
                break;
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); ++i) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
