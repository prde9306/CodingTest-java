package LeetCode.Medium;

public class HouseRobber {

    /*
    class Solution {
    public int rob(int[] nums) {
        int answer;

        int sumA=0;
        int sumB=0;

        for(int i=0; i<nums.length; i+=2){
            sumA+=nums[i];
        }

        for(int i=1; i<nums.length; i+=2){
            sumB+=nums[i];
        }

        answer = Math.max(sumA, sumB);

        return answer;

    }
}
     */

    /*
    class Solution {
    public int rob(int[] nums) {
        int answer;
        int sum;

        //그냥 이중 포문 돌려서 1칸 건너 뛰고 더하기 해서 max값
        for(int i=0; i<nums.length; i++){
            sum=nums[i];
            for(int j=i+1; j<nums.length; j++){
                sum +=nums[j];
            }
            answer = sum
        }
}
     */

    /*
    class Solution {
    public int rob(int[] nums) {
        int answer;
        int sum;
        int max = 0;

        //그냥 이중 포문 돌려서 1칸 건너 뛰고 더하기 해서 max값
        if(nums.length==1) return nums[0];
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }

        for(int i=0; i<nums.length; i++){
            sum=nums[i];
            for(int j=i+2; j<nums.length; j++){
                sum +=nums[j];
                for(int k=j+1; k<nums.length; k+=2){
                    sum+=nums[k];
                }
            }
            max = Math.max(sum, max);
        }
        return max;
}
}
     */
    
    //dp로 풀어야 한다.
    class Solution {
        public int rob(int[] nums) {
            if (nums.length == 0) return 0;
            if (nums.length == 1) return nums[0];

            nums[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
            }

            return nums[nums.length - 1];
        }
    }
}
