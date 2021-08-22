package InflearnLecture.chap02Array;

public class pro8 {
    import java.util.Scanner;
import java.*;

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

        public static void main(String[]args) throws IOException{
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
