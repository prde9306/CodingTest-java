package LeetCode.Easy;

public class SearchInsertPosition {
    //sol1 이렇게 푸는 방식을 지향해

    public int searchInsert1(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            int mid = (i+j)/2;

            if(target > nums[mid]){
                i=mid+1;
            }else if(target < nums[mid]){
                j=mid-1;
            }else{
                return mid;
            }
        }
        return i;
    }
    //sol2
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int a = 0;
        int r = nums.length - 1;

        while (a < r) {
            int m = a + (r - a) / 2;
            if (target > nums[m]) {
                a = m + 1;
            } else {
                r = m;
            }
        }
        return a;
    }
}