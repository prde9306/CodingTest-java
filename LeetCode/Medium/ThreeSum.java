package LeetCode.Medium;

import java.util.Arrays;

public class ThreeSum {
    import java.util.ArrayList;
import java.util.Arrays;

    //3sum 문제 의도가 명확하게 이해되지 않는데
//모든 triplets을 return,배열에 담아서  i,j,k각각 달라야 하고,
//nums[i]+ nums[j]+nums[k]==0이여야
//조합해서 합이 0인 것 구하면 된다.
//twopointer?
//이분탐색 응용
    class Solution {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new LinkedList<List<Integer>>();

            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i-1]) continue;

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];

                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while (nums[left] == nums[left - 1] && left < right) left++;
                        while (nums[right] == nums[right + 1] && left < right) right--;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }

            return res;
        }
    }
}
