package InflearnLecture.chap06SortingAndSearching;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pro6 {
    /**
     * 이렇게 안풀린다.
     * import java.io.IOException;
     * import java.util.ArrayList;
     * import java.util.Scanner;
     *
     * // 배열2개에 담아라
     * // <로 확인하면서 cnt 올리고 <에 만족하지 않으면 배열에 집어넣기
     * class Main{
     *
     *    public ArrayList<Integer> solution(int N, int[]arr){
     *       ArrayList<Integer> answer = new ArrayList<>();
     *       int cnt =0;
     *
     *       for(int i=0; i<N-1; i++){
     *          if(arr[i]<=arr[i+1]){
     *             cnt++;
     *          }
     *          else{
     *             answer.add(++cnt);
     *
     *          }
     *       }
     *       return answer;
     *    }
     *    public static void main(String[]args)throws IOException{
     *       Main T = new Main();
     *
     *       Scanner sc = new Scanner(System.in);
     *       int N = sc.nextInt();
     *       int []arr= new int[N];
     *       for(int i=0; i<N; i++){
     *          arr[i]=sc.nextInt();
     *       }
     *
     *       for(int x : T.solution(N, arr)){
     *          System.out.print(x+" ");
     *       }
     *
     *    }
     * }
     */

    //sol2

    // 배열2개에 담아라
// <로 확인하면서 cnt 올리고 <에 만족하지 않으면 배열에 집어넣기
    class Main{

        public ArrayList<Integer> solution(int N, int[]arr){
            ArrayList<Integer> answer = new ArrayList<>();
            // 깊은 복사를 해야 arr은 그대로 있음
            int[]tmp = arr.clone();
            Arrays.sort(tmp);
            for(int i=0; i<N; i++){
                if(arr[i]!=tmp[i])answer.add(i+1);
            }
            return answer;
        }
        public static void main(String[]args)throws IOException {
            Main T = new Main();

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int []arr= new int[N];
            for(int i=0; i<N; i++){
                arr[i]=sc.nextInt();
            }

            for(int x : T.solution(N, arr)){
                System.out.print(x+" ");
            }

        }
    }

}
