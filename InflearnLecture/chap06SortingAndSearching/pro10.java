package InflearnLecture.chap06SortingAndSearching;

public class pro10 {
    /**
     * public int solution(int N, int M, int[]arr){
     *
     * //     Arrays.sort(arr);
     * //두말사이의 거리 최솟값은 1이다라고 해야 arr[0]하면 답 안나올 수 잇음- 항상 0번째에 배치하라는 법 없으니
     * //int lt = 1;
     * //     //rt는 맨 마지막꺼로 하자
     * //     int rt = N-1;
     * // //가장 가까운 말의 거리를 mid라고 하고 배치한다.
     * //     mid =
     * int answer =0;
     * Arrays.sort(arr);
     * int lt =1;
     * int rt = arr[n-1];
     * while(lt<=rt){
     *     int mid = (lt+rt)/2;
     *     if(count(arr, mid)>=M){
     *         answer = mid;
     *         lt =mid +1;
     *     }else{
     *         rt = mid-1;
     *     }
     *
     * }
     * return answer;
     * }
     *
     * //결정 알고리즘은 count함수를 만들 수 있는지가 최대 관건이다.
     * public int count(int[]arr, int dist){
     *     //제일 왼쪽좌표에 한마리 배치
     *     int cnt =1;
     *     int ep = arr[0];
     *     for(int i=1; i<arr.length; i++){
     *         if(arr[i]-ep)>=dist){
     *         cnt++;
     *         ep=arr[i];
     *     }
     *     }
     *     return cnt;
     * }
     */
}
