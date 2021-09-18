package LeetCode.Medium;

//3개합 && target과 가장 가까운 값

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //sum과 target의 절댓값 차 가장 작은 경우
        int min = Integer.MAX_VALUE;

        for( int i=0; i<nums.length-2; i++){
            int lt =i+1;
            int rt = nums.length-1;

            while(lt<rt){
                if(nums[i]==0& nums[lt]==0& nums[rt]==0) return 0;
                int sum = nums[i]+ nums[lt]+ nums[rt];
                int closest = Math.abs(sum-target);
                min = Math.min(min, closest);
                rt--;
            }
        }
        if(min> target) return min+target;
        else{
            return target-min;
        }
    }
}