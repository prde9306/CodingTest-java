package InflearnLecture.chap06;

public class pro8 {

    /**
     * 이분 탐색
     * import java.io.IOException;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Scanner;
     *
     *
     * class Main{
     *
     *
     *    public int solution(int N, int M, int[]arr){
     *
     *       Arrays.sort(arr);
     *       int lt =0;
     *       int rt = N-1;
     *       int answer =0;
     *
     *       while(lt<=rt){
     *          int mid = (lt+rt)/2;
     *
     *          answer++;
     *          if(M>arr[mid]){
     *             lt=mid+1;
     *          }
     *          else if(M<arr[mid]){
     *             rt=mid-1;
     *          }
     *          else{
     *             answer =mid+1;
     *             break;
     *
     *          }
     *
     *       }
     *       return answer;
     *
     *    }
     *
     *    public static void main(String[]args)throws IOException{
     *
     *       Main T = new Main();
     *
     *       Scanner sc = new Scanner(System.in);
     *
     *       int N = sc.nextInt();
     *       int M = sc.nextInt();
     *
     *       int[]arr = new int[N];
     *       for(int i=0; i<N; i++){
     *          arr[i]= sc.nextInt();
     *       }
     *       System.out.print(T.solution(N, M, arr));
     *
     *    }
     * }
     */
}
