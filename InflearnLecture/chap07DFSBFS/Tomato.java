package InflearnLecture.chap07DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



//그래프 BFS 강의 먼저
class Point{
    public int x;
    public int y;

    Point(int x, int y){
        this.x = x;
        this.y= y;
    }
}

class Main{
    static int board[][];
    static int dis[][];
    static int []dx ={-1,0,1,0};
    static int []dy ={0, 1, 0, -1};
    static Queue<Point> Q = new LinkedList<>();

    public void BRS(int x, int y){
        //객체가 큐로
        Q.offer(new Point(x,y));
        board[x][y]=1;
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            //여기서 12,9,3,6시 퍼져나감
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny]= dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[]args){
        부분집합 T = new 부분집합();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        board = new int[M][N];
        dis = new int[M][N];
        //BFS 돌기전에 출발점이 여러 개이면 미리 넣어놓아라

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                board[i][j]=sc.nextInt();
                if(board[i][j]==1)Q.offer(new Point(i, j));
            }
        }
        T.BFS();
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(board[i][j]==0) flag = false;

            }
        }
        if(flag){
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);

    }
