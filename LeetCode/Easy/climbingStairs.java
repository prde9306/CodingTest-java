package LeetCode.Easy;

class Solution {
    public int climbStairs(int n) {
        int dy[] = new int[10000];
        dy[1]=1;
        dy[2]=2;
        for(int i=3; i<n; i++){
            dy[i]= dy[i-1]+dy[i-2];
        }

        return dy[n];

    }
}