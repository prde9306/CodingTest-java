package InflearnLecture.chap06SortingAndSearching;

public class pro9 {
    /**
     * public int count(int[]arr, int capacity){
     *     int cnt =1, sum=0;
     *     for(int x: arr)
     *     {
     *         if(sum+x>capacity) {cnt++;
     *             sum=x;
     *
     *     }else{
     *         sum+=x;
     *     }
     *     return cnt;
     *
     * }
     *
     * public int solution(int N, int M, int[]arr){
     *     int answer =0;
     *     //스트림으로 최대값 찾아라
     *     int lt = Arrays.stream(arr).max().getAsint();
     *     int rt = Arrays.stream(arr).som();
     *     while(lt<=rt){
     *         int mid (lt+rt)/2;
     *         if(count(arr, mid)<=m){
     *             answer =mid;
     *             rt=mid-1;
     *         }
     *         else{
     *             lt =mid+1;
     *         }
     *     }
     *     return answer;
     * }
     */
}
