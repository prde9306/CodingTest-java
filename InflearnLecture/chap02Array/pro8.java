package InflearnLecture.chap02Array;

import java.io.IOException;
import java.util.ArrayList;

public class pro8 {

    class Main{

        public int[] solution(int N, int[]scores){
            int[] answer = new int[N];
            for(int i=0; i<N; i++){
                int cnt =1;
                for(int j=0; j<N; j++){
                    if(scores[i]<scores[j]) cnt++;
                }
                scores[i]=cnt;
            }

            return answer;
        }

            //이렇게 풀면 안된다.
            public ArrayList<Integer> solution2(int N, int[]arr){

                ArrayList<Integer> answer = new ArrayList<>();


                for(int i=0; i<N; i++){
                    int cnt =0;
                    for(int j=0; j<N; j++){
                        if(arr[i]<=arr[j])cnt++;
                    }
                    answer.add(cnt);
                }
                return answer;
            }


            public static void main(String[]args) throws IOException {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int []scores= new int[N];
            for(int i=0; i<N; i++){
                scores[i]=sc.nextInt();
            }
            for(int x: T.solution(N, scores)) System.out.print(x+" ");        ;

        }
    }
}
