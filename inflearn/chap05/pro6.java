package inflearn.chap05;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{

    public int solution(int N, int M){
    //이런 방식도 가능
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();

        for(int i=1; i<=N; i++){
            qu.offer(i);
        }

        while(!qu.isEmpty()){
            int count = 1;
            if(count%M==0 ){
                answer.offer(qu.poll());
                count++;

            }else{
                qu.offer(qu.poll());
                count++;
            }
        }//여기서 잘못 됨
        return answer.get(N-1);
    }

    //sol2
    public  int solution2(int n, int k){
        int answer =0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<=n; i++)Q.offer(i);
        while (!Q.isEmpty()){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
           //k일 때는 빼기
            Q.poll();
            if(Q.size()==1) answer= Q.poll();
        }
        return answer;
    }


    public static void main(String[]args)throws IOException {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.print(T.solution(N, M));

    }
}