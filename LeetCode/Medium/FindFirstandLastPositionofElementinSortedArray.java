package LeetCode.Medium;

//binarySearch안하고 풀 경우


class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] answer = new int[2];
        int cnt =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                cnt=i;
                min = Math.min(min,cnt);
                max = Math.max(max, cnt);
            }
        }
        if(min== Integer.MAX_VALUE){
            min =-1;
        }
        if(max ==Integer.MIN_VALUE){
            max =-1;
        }


        answer[0]=min;
        answer[1]= max;

        return answer;

    }
}

//binarySearch로 풀 경우 (이렇게 푸는 것도 알기)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]result = new int[2];

        result[0]= findStartingIndex(nums, target);
        result[1]= findEndingIndex(nums, target);

        return result;
    }

    public int findStartingIndex(int[]nums, int target){
        int index =-1;

        int start =0;
        int end = nums.length-1;

        while(start<=end){

            int midpoint = start + (end-start)/2;

            if(nums[midpoint]>= target){
                end = midpoint-1;
            }else{
                start = midpoint+1;
            }
            if(nums[midpoint]==target) index =midpoint;
        }

        return index;
    }

    public int findEndingIndex(int[]nums, int target){
        int index =-1;

        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int midpoint = start + (end-start)/2;

            if(nums[midpoint]<=target){
                start = midpoint+1;
            }else{
                end = midpoint -1;
            }
            if(nums[midpoint]==target) index =midpoint;
        }

        return index;
    }


}

