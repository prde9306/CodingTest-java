
import java.io.IOException;
import java.util.Scanner;

class Main{
    public String solution(int N, int[]A, int[]B){
        String answer ="";
        for(int i=0; i<N; i++){
            if(A[i]==B[i]) answer+="D";
            else if(A[i]==1 && B[i]==3) answer+="A";
            else if(A[i]==2 && B[i]==1) answer+="A";
            else if(A[i]==3 && B[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;

    }


    public static void main(String[]args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]A = new int[N];
        int[]B = new int[N];

        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }

        for(int i=0; i<N; i++){
            B[i]=sc.nextInt();
        }
        for(char x: T.solution(N, A, B).toCharArray()) System.out.println(x);

    }
}
     