package LeetCode.Medium;

public class productArrayExceptSelf {

    //sol time limit
    class Solution {
        public int[] productExceptSelf(int[] nums) {

            int[] answer = new int[nums.length];

            for(int j=0; j<nums.length; j++){
                int tmp = 1;
                int abc;

                for(int i=0; i<nums.length; i++){
                    abc = nums[j];
                    nums[j]=1;
                    tmp *= nums[i];
                    nums[j]=abc;

                }
                answer[j] = tmp;
            }
            return answer;
        }
    }
}
