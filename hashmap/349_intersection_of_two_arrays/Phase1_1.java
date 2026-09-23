import java.util.List;
import java.util.ArrayList;

/**
 * InstersectionTwoArrays Solution
 */

// 配列の総当たり

// あれば配列に格納し、breakで即抜ける
// 無くてもあっても次の要素を見に行く
// 最後まで無い場合retrunで要素なしの配列を返す

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        // forで基準となるnum1[]の要素を決める
        for(int i = 0; i < nums1.length; ++i ) {
            for(int j = 0; j < nums2.length; ++j) {
               // 基準値をnums2と比較させる。
                if(nums1[i] == nums2[j]) {

                    boolean isDuplicate = false;

                    for(int k = 0; k < result.size(); ++k) {
                        if(result.get(k) == nums1[i]){
                            isDuplicate = true;
                            break;

                        }

                    }
                    if (!isDuplicate){
                    result.add(nums1[i]);
                    break;
                    }
                }
            }

        }
    
        int [] resultArray = new int[result.size()];
        for(int i= 0; i < result.size(); ++i){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

}
