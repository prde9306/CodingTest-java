package InflearnLecture.chap10dynamic;

//dy는 i번째 숫자를 마지막 항으로 하는 최대 중가수열(이걸 암기해야)
//i 번째 항의 숫자보다 작으면서 그 중 최댓값 찾는 것

import java.io.IOException;
import java.util.Scanner;

class Main{
    static int[] dy;
    public int solution(int[]arr){
        int answer =0;
        dy = new int[arr.length];
        //dy 0인 이유 : 0번째 항의 값보다 작은 것 없고 +1(자기자신)
        dy[0]=1;
        for(int i=1; i<arr.length; i++){
            int max =0;//max 0으로 하는 이유 잘알기
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && dy[j]>max) max =dy[j];
            }
            dy[i]= max+1;
            answer = Math.max(answer, dy[i]);
        }
        return  answer;
    }
    public static void main(String[] args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(T.solution(arr));
    }
}