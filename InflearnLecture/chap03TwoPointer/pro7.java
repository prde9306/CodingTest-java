package InflearnLecture.chap03TwoPointer;

import java.io.IOException;
import java.util.Scanner;

class Main{


    public int solution(int N, int K, int[]arr){
        int cnt =0, answer =0, lt=0;

        for(int rt=0; rt<N; rt++){
            if(arr[rt]==0) cnt++;

            while(cnt>K){
                if(arr[lt]==0) cnt--;
                lt++;
            }

            answer = Math.max(answer, rt-lt+1);
            return answer;
        }
    }



    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(T.solution(N, K, arr));

    }
}