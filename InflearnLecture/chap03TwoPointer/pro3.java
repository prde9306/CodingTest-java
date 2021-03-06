package InflearnLecture.chap03TwoPointer;

import java.io.IOException;
import java.util.*;

class Main {
    //이렇게 풀면 타임 리밋 나온다.(계속 이 방식으로 생각해냄)
    public int solution(int N, int M, int[] arr) {
        int max = Integer.MIN_VALUE;
        int answer = 0;
        int lt = 0;

        while (lt + M != N + 1) {
            answer = 0;
            for (int i = lt; i < lt + M; i++) {
                answer += arr[i];
                max = Math.max(answer, max);
            }
            lt++;
        }
        return max;
    }

    //이렇게 풀어야 한다.
    public int solution2(int N, int M, int[] arr) {
        int answer, sum = 0;
        for (int i = 0; i < M; i++) sum += arr[i];
        answer = sum;
        for (int i = M; i < N; i++) {
            sum += (arr[i] - arr[i - M]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    //위랑 비슷 한 풀이 (계속 이렇게 푸네), 어쨋든 같은 풀이임
    public int solution3(int N, int M, int[]arr){
        int answer =0;
        int max = Integer.MIN_VALUE;
        int lt = 0;
        int rt = M-1;
        for(int i=0; i<M-1; i++){
            answer+=arr[i];
        }
        while(rt<N){
            answer+=arr[rt++];
            max = Math.max(max, answer);
            answer-=arr[lt++];
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(N, M, arr));

    }

}
}
