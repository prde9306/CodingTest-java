package InflearnLecture.chap08DFSBFSLv2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
    static int N;
    static int[][]board;
    static int answer;
    static int[]dx = {-1,-1,0,1,1,1,0,-1};
    static int[]dy = {0,1,1,1,0,-1,-1,-1};

    public static void DFS(int x, int y){

        for(int i=0; i<8; i++){
            int nx = x +dx[i];
            int ny = y+ dy[i];

            if(nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    DFS(i, j);
                }
            }
        }

        System.out.print(answer);

    }
}


/**
 * BFS로 풀기
 */

class Point{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Main{
    static int N;
    static int answer=0;
    static int[]dx = {-1,-1,0,1,1,1,0,-1};
    static int[]dy = {0,1,1,1,0,-1,-1,-1};
    Queue<Point> queue = new LinkedList<>();

    public void BFS(int x, int y, int[][]board){
        queue.add(new Point(x, y));
        while(!queue.isEmpty()){
            Point pos = queue.poll();
            for(int i=0; i<8; i++){
                int nx = pos.x +dx[i];
                int ny = pos.y +dy[i];
                if(nx>=0 && nx<N && ny<N && ny>=0 &&board[nx][ny]==1){
                    board[nx][ny]=0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    public void solution(int[][]board){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(board[i][j]==1){
                    board[i][j]=0;
                    BFS(i,j,board);
                    answer++;
                }
            }
        }
    }
    public static void main(String[]args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        N =sc.nextInt();
        int[][]board = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j]= sc.nextInt();
            }
        }
        T.solution(board);
        System.out.println(answer);
    }

}