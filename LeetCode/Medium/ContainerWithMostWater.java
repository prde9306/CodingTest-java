package LeetCode.Medium;

public class ContainerWithMostWater {

    //sol1
    //이중 포문 돌려도 시간 초과난다.
    //이렇게 풀면 시간초과 난다.
    class Solution {
        public int maxArea(int[] height) {

            int max = Integer.MIN_VALUE;
            int lt = 0;
            int rt = height.length - 1;
            if (rt == 1) return Math.min(height[0], height[1]);

            while (rt != 1) {

                for (int i = 0; i < rt; i++) {
                    int max_height = Math.min(height[i], height[rt]);
                    int sum = (rt - i) * (max_height);
                    if (max < sum) {
                        max = sum;
                    }
                }
                rt--;
            }
            return max;
        }
    }

    //sol2 time limit
    class Solution {
        public int maxArea(int[] height) {
            int max = Integer.MIN_VALUE;
            for(int i=0; i<height.length; i++){
                for(int j= i+1; j<height.length; j++){
                    int min = Math.min(height[i], height[j]);
                    max = Math.max(max, min*(j-i));
                }

            }
            return max;
        }
    }

    //two pointer 로 풀어야 겠다는 생각은 함
    class Solution{
        public int maxArea(int[]heights){
            int max = Integer.MIN_VALUE;
            int lt =0;
            int rt = heights.length-1;
            while(lt<rt){
                int min = Math.min(heights[lt], heights[rt]);
                max = Math.max(max, min*(rt-lt));

                //이 아래 생각 ###못해
                if(heights[lt]<heights[rt]){
                    lt++;
                }else{
                    rt--;
                }
            }
            return max;
        }

    }

}
