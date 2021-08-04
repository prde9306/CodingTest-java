package inflearn.chap02;

public class pro10 {
    /**
     * import java.util.Scanner;
     * import java.*;
     *
     * class Main{
     *     int[]dx={-1,0,1,0};
     *     int[]dy={0,1,0,-1};
     *
     *     //3중 포문 도는 메커니즘, flag처리, index 밖으로 나가지 않게
     *     public int solution (int N, int[][]arr){
     *         int answer =0;
     *         for(int i=0; i<=N; i++){
     *             for(int j=0; j<N; j++){
     *                 boolean flag =true;
     *                 for(int k=0; k<4; k++){
     *                     int nx = i +dx[k];
     *                     int ny = j +dy[k];
     *                     //앞에서 미리 인덱스 바운더리 넘지 않게
     *                     if( nx>=0 && nx<n && ny>=0 && ny>n && arr[nx][ny]>=arr[i][j]){
     *                         flag = false;
     *                         break;
     *                     }
     *                 }
     *                 if(flag) answer ++;
     *
     *             }
     *
     *         }
     *
     *
     *         return answer;
     *     }
     *
     *     public static void main(String[]args) throws IOException{
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         int N = sc.nextInt();
     *         int [][]arr= new int[N][N];
     *         for(int i=0; i<N; i++){
     *             for(int j=0; j<N; j++){
     *                 arr[i][j]=sc.nextInt();
     *             }
     *         }
     *         T.solution(N, arr);
     *
     *     }
     * }
     */
}
