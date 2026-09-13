/* TwoSum SolutionClass */
class Solution {

    public int[] twoSum(int nums[], int target){

        // 配列の要素と要素を足し合わせる。合計がtargetと一致するか確認する方法。
        // 外側のfor文では以降の配列の要素と足し合わせる基準の数字を指定する
        for(int i = 0; i < nums.length; ++i){

            // 基準となる数字と足し合わせる数字を指定する
            for(int j = i + 1; j < nums.length; ++j){
                int total = nums[i] + nums[j];
                
                if (target == total) {

                    // 配列の位置を返す
                    return new int []{i,j};

                }
            }
        }
    return new int[]{0,0};

    }
}