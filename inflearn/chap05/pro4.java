package inflearn.chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
    Queue<Integer> qu = new LinkedList<>();
    Queue<Integer> answer = new LinkedList<>();

    public Queue<Integer> solution(int N, int M){
        for(int i=0; i<N; i++){
            qu.offer(i);
        }

        while(!qu.isEmpty()){
            for(int j=0; j<N; j++){
                if(j==M-1){
                    answer.offer(qu.poll(j));
                }else{
                    qu.offer(qu.poll(j));
                }
            }
        }
        return answer;
    }


    public static void main(String[]args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.print("<");
        for(int x : T.solution(N, M)){
            System.out.print(x+", ");
        }
        System.out.print(">");
    }
}