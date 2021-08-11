import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

//카카오 문제 내풀이 왜 안되나 고민
class Main{
    public int[] solution(int N, int M, int[]arr){

        int []answer=new int[N];

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(arr[i] == answer[j]){
                    for(int k=j; k>0; k--){
                        answer[j]=answer[j-1];
                    }
                    answer[0]=arr[i];
                }
                else{
                    for(int L=N-1; L>0; L--){
                        answer[L]= answer[L-1];
                    }
                    answer[0]=arr[i];
                }
            }
        }
        return answer;
    }

    public static void main(String[]args)throws IOException{
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int []arr = new int[M];
        for(int i=0; i<M; i++){
            arr[i]=sc.nextInt();
        }

        for(int x : T.solution(N, M, arr)){
            System.out.print(x+" ");
        }

    }
}
