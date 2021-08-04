package inflearn.chap02;

public class pro9 {
    /**
     * import java.util.Scanner;
     * import java.*;
     *
     * class Main{
     *
     *     public int solution (int N, int[][]scores){
     *         int answer =Integer.MIN_VALUE;
     *         int sum =0;
     *         int target=0;
     *         int target2 =0;
     *         //가로합
     *         for(int i=0; i<N; i++){
     *             for(int j=0; j<N; j++){
     *                 target+=scores[i][j];
     *             }
     *             sum = Math.max(sum, target );
     *         }
     *
     *         //세로합
     *         for(int j=0; j<N; j++){
     *             for(int i=0; i<N; i++){
     *                 target2+=scores[i][j];
     *             }
     *             sum = Math.max(sum, target2);
     *         }
     *
     *
     *         //대각선 합
     *
     *         return sum;
     *
     *     }
     *
     *     public static void main(String[]args) throws IOException{
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         int N = sc.nextInt();
     *         int [][]scores= new int[N][N];
     *         for(int i=0; i<N; i++){
     *             for(int j=0; j<N; j++){
     *                 scores[i][j]=sc.nextInt();
     *             }
     *         }
     *         T.solution(N, scores);
     *
     *     }
     * }
     */
}
