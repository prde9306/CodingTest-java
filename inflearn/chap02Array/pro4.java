package inflearn.chap02Array;

import java.io.IOException;
import java.util.Scanner;

public class pro4 {
    //so1 이게 일반적인 방식 이렇게 해서 맞음

    class Main{

        public int[] solution (int N){
            int []answer = new int[N];
            answer[0]=1;
            answer[1]=1;
            for(int i=2; i<N; i++){
                answer[i]= answer[i-1]+answer[i-2];
            }

            return answer;
        }


        public static void main(String[]args)throws IOException{

            Main T = Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            for( int x: T.solution(N)) System.out.print(x+" ");


        }
    }
    //배열 쓰지 않는 경우
    class Main{
        public void solution(int n){
            int a=1, b=1, c;
            System.out.print(a+" "+b+" ");
            for(int i=2; i<n; i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }

        public static void main(String[]args)throws IOException {

            Main T = Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            T.solution();


        }
    }
}
