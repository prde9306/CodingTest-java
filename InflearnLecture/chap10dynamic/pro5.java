package InflearnLecture.chap10dynamic;

public class pro5 {
    /**
     * import java.io.IOException;
     * //  동전 가장 적은 수의 동전으로 교환
     * //dfs로 풀어도 되는데 시간초과남
     *
     * import java.util.Scanner;
     *
     * class main{
     *     static int []dy;
     *
     *     public int solution(int N, int M, int[]coin){
     *         Arrays.fill(dy, Integer.MAX_VALUE);
     *         dy[0]=0;
     *         for(int i=0; i<N; i++){
     *             for(int j=coin[i]; j<=M; j++){
     *                 dy[j]= Math.min(dy[j], dy[j-coin[i]]+1);
     *
     *             }
     *         }
     *         return dy[M];
     *     }
     *
          public static void main(String[]args) throws IOException{
     *
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         int N = sc.nextInt();
     *         int []sort = new int[N];
     *         for(int i=0; i<N; i++){
     *             sort[i]= sc.nextInt();
     *         }
     *         int M = sc.nextInt();
     *         dy = new int[M+1];
     *
     *         System.out.print(T.solution(sort, N, M));
     *     }
     *
     * }
     */
}
