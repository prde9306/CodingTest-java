package inflearn.chap03;

public class pro3 {

    /**
     * import java.util.ArrayList;
     * import java.util.Scanner;
     *
     * class Main{
     * //sol1 이중 포문으로 푸는 것 가능
     *
     *
     *     public ArrayList<Integer> solution(int N, int M, int[]arr1, int[]arr2){
     *         ArrayList<Integer> answer = new ArrayList();
     *         Arrays.sort(arr1);
     *         Arrays.sort(arr2);
     *         int p1=0, p2=0;
     *
     *         while(p1<N && p2<M){
     *             if(arr1[p1]==arr2[p2]) {
     *             answer.add(arr1[p1++]);
     *             p2++;
     *         }
     *         //여기를 이렇게 생각.........
     *         else if(arr1[p1]< arr2[p2]) p1++;
     *         else p2++;
     *         }
     *         return answer;
     *
     *
     *     }
     *
     *     public static void main(String[]args)throws IOException{
     *         Main T = new Main();
     *
     *         Scanner sc = new Scanner(System.in);
     *         int N = sc.nextInt();
     *         int []arr1 = new int[N];
     *         int M = sc.nextInt();
     *         int []arr2 = new int[M];
     *
     *         for(int i=0; i<N; i++){
     *             arr1[i] = sc.nextInt();
     *         }
     *         for(int j=0; j<M; j++){
     *             arr2[i] = sc.nextInt();
     *         }
     *         for(int x : T.solution(N, M, arr1, arr2)){
     *         System.out.print(x+" ");
     *         }
     *
     *     }
     * }
     */
}
