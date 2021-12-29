package LeetCode.Medium;

public class productArrayExceptSelf {

    //sol time limit
    class Solution {
        public int[] productExceptSelf(int[] nums) {

            int[] answer = new int[nums.length];

            for (int j = 0; j < nums.length; j++) {
                int tmp = 1;
                int abc;

                for (int i = 0; i < nums.length; i++) {
                    abc = nums[j];
                    nums[j] = 1;
                    tmp *= nums[i];
                    nums[j] = abc;

                }
                answer[j] = tmp;
            }
            return answer;
        }
    }

    class Solution {
        public int[] productExceptSelf(int[] nums) {

            int[] result = new int[nums.length];

            int[] t1 = new int[nums.length];
            int[] t2 = new int[nums.length];

            t1[0]=1;

            t2[nums.length-1]=1;

            //scan from left to right
            for(int i=0; i<nums.length-1; i++){
                t1[i+1] = nums[i] * t1[i];
            }

            //scan from right to left
            for(int i=nums.length-1; i>0; i--){
                t2[i-1] = t2[i] * nums[i];
            }

            //multiply
            for(int i=0; i<nums.length; i++){
                result[i] = t1[i] * t2[i];
            }

            return result;
        }
    }

    /*
     1
     1*2
     1*2*3
     1*4
     1*4*3
     1*4*2
     1*2*3
     이런 식으로
     */
}
