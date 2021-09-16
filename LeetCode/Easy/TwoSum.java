package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

public class TwoSum {

    class Solution {

        //sol1 내풀이, 시간복잡도 : O(n^2)
        //린턴하는 방식 암기 똑바로
        public int[] twoSum(int[] nums, int target) {
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
        public int[] twoSum(int[] nums, int target) {
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
            return new int[]{1, 2};
        }
    }
    //sol 3  이렇게는 왜 안되는지?
    class solution {
        public int[] twoSum(int[] nums, int target) {
            int[] answer = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }
            return answer;
        }
    }

}
