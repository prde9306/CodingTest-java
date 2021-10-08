package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    class Solution {

        //sol1 내풀이, 시간복잡도 : O(n^2)
        //린턴하는 방식 암기 똑바로
        public int[] twoSum1(int[] nums, int target) {
            int nums_length = nums.length;
            for (int i = 0; i < nums_length - 1; ++i) {
                for (int j = i + 1; j < nums_length; ++j) {
                    if (nums[j] == target - nums[i]) {

                        //이렇게 리턴 기억 잘해
                        return new int[]{i, j};
                    }
                }
            }//이렇게 리턴 기억 잘해
            return new int[2];
        }

        //sol2 시간 복잡도 줄이기, 시간복잡도 : O(N) HashMap 구현
        //HashMap 구현 방법 정확히 이해하기
        public int[] twoSum2(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int nums_length = nums.length;
            Integer res;

            for (int i = 0; i < nums_length; i++) {
                res = map.get(nums[i]);
                if (res != null) {
                    //여기 특히 정확히 이해
                    return new int[]{res, i};
                } else {
                    map.put(target - nums[i], i);
                }
            }
            Integer.MAX_VALUE
            return new int[]{1, 2};
        }
    }
}
