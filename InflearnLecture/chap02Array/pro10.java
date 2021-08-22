package InflearnLecture.chap02Array;

import java.io.IOException;
import java.util.Scanner;

class Main{

    int[]dx = {-1,0,1,0};
    int[]dy = {0,1,0,-1};

    public int solution(int N, int[][]arr){
        int answer =0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    //실제로 배열을 안 늘려줬으니까 밖으로 빠지는 것 맊아줘야 함
                    if(nx>=0 && nx<N && ny>=0 && ny<N &&arr[i][j]<=arr[nx][ny]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args)throws IOException{

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][]arr = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.print(T.solution(N, arr));

    }
}