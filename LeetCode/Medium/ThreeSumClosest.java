package LeetCode.Medium;

//3개합 && target과 가장 가까운 값

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        //ret 을 생각하느냐 못하느냐
        int ret=0;
        for(int i=0 ; i<nums.length-2 ; i++) {
            int lt=i+1;
            int rt=nums.length-1;

            while(lt<rt) {
                int sum = nums[i]+nums[lt]+nums[rt];
                if(Math.abs(target-sum)<min) {
                    min = Math.abs(target-sum);
                    //이렇게 최소일 때 어떻게 정답을 담을 수 있을지(이걸 고민 했었는데)
                    ret = sum;
                }
                if(sum<target) lt++;
                else if(sum>target) rt--;
                else return target;
            }
        }
        return ret;
    }
}