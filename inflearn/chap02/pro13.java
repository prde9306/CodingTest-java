package inflearn.chap02;

public class pro13 {
    import java.util.Scanner;

    class Main{

        //맨 마지막에 있는 조합은 생길 수 없고
//4중포문이래
//모든 경우의 수 다 돌면서 확인해야
        public int solution(int N, int M, int[][]arr){
            int answer =0;
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    int cnt=0;
                    for(k=0; k<M; k++){
                        int pi=0, pj=0;
                        for(s=0; s<N; s++){
                            if(arr[k][s]==i){
                                pi=s;
                            }
                            if(arr[k][s]==j){
                                pj=s;
                            }
                        }
                        if(pi<pj) cnt++;
                    }
                    if(cnt==M) answer++;
                }

            }
            return answer;
        }


        public static void main(Stirng[]args) throws IOException{

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();
            int [][]arr = new int[M][N];

            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.print(T.solution(N, M, arr));
        }
    }
}
