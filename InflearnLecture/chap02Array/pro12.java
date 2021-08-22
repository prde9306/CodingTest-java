package InflearnLecture.chap02Array;

//진짜 약수를 출력해라
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public int solution(int N, int[]arr){
        int answer =0;
        answer = arr[0]* arr[N-1];
        return answer;

    }



    public static void main(String[]args)throws IOException {
    Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print(T.solution(N, arr));
    }
}
