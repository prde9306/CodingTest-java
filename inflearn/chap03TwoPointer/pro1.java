package inflearn.chap03TwoPointer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class pro1 {

    //TwoPointersAlgorithm
    /**
     *  public ArrayList<Integer> solution(int N, int M, int[]arr1, int[]arr2){
     *         ArrayList<Integer> answer = new ArrayList<>();
     *
     *         int p1=0, p2=0;
     *
     *         while(p1<N && p2<M){
     *             if(arr1[p1]<arr2[p2]) answer.add(a[p1++]);
     *             else answer.add(b[p2++]);
     *         }
     *         while(p1<N) answer.add(a[p1++]);
     *         while(p2<N) answer.add(b[p2++]);
     *
     *         return answer;
     *     }
     */

    //이런식으로 짜는 게 의도가 아니야

    class Main{

        public int[] solution(int N, int M, int[]arr1, int[]arr2){
            int []answer = new int[N+M];
            for(int i=0; i<N; i++){
                answer[i]= arr1[i];
            }
            for(int j=N; j<N+M; j++){
                answer[j]= arr2[j];
            }
            Arrays.sort(answer);

            return answer;
        }

        public static void main(String[]args)throws IOException {
            Main T = new Main();

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int []arr1 = new int[N];
            int M = sc.nextInt();
            int []arr2 = new int[M];

            for(int i=0; i<N; i++){
                arr1[i] = sc.nextInt();
            }

            for(int j=0; j<M; j++){
                arr2[j] = sc.nextInt();
            }
            for(int x : T.solution(N, M, arr1, arr2)){
                System.out.print(x+" ");
            }

        }
    }

}
