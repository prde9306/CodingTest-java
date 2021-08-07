package inflearn.chap05;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

class Main{

    /**푸는 메커니즘은 똑같이 맞음
     *
     *  public int solution(int [][]boards, int[]moves){
     *         int answer =0;
     *         Stack<Integer> st = new Stack<>();
     *         for(int pos : moves){
     *             for(int i=0; i<board.length; i++){
     *                 if(board[i][pos-1]!=0){
     *                     int tmp =board[i][pos-1];
     *                     board[i][pos-1]=0;
     *                     if(!st.isEmpty() && tmp==st.peek()){
     *                         answer +=2;
     *                         st.pop();
     *                     }
     *                     else st.push(tmp);
     *                     break;
     *                 }
     *             }
     *         }
     *     }
     */
    public int solution(int N, int [][]boards, int M, int[]moves){
        int answer =0;
        int tmp;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<M; i++){
            tmp = moves[i];
            for(int j=0; j<N; j++){
                if(boards[j][tmp-1]!=0){

                if(st.peek()==boards[j][tmp-1]){
                    st.pop();
                    answer+=2;
                }else{
                    st.push(boards[j][tmp-1]);
                }
                //if(st.앞, 뒤가 같으면 둘다 팝)하고 카운트 +2
                boards[j][tmp-1]=0;
                break;
                }
            }
        }
        return answer;
    }

    public static void main(String[]args)throws IOException {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][]boards = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                boards[i][j]=sc.nextInt();
            }
        }
        int M = sc.nextInt();

        int [] moves = new int[M];

        for(int i=0; i<M; i++){
            moves[i]=sc.nextInt();
        }

        System.out.print(T.solution(N, boards, M, moves));

    }
}