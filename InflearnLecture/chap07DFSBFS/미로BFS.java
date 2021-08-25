package InflearnLecture.chap07DFSBFS;

public class 미로BFS {
/**
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

        public void BRS(int x, int y){

            Queue<Point> Q = new LinkedList<>();
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
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            board = new int[8][8];
            dis = new int[8][8];
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    board[i][j] = sc.nextInt();
                }
            }
            T.BFS(1, 1);
            if(dis[7][7]==0) System.out.println(-1);
            else System.out.println(dis[7][7]);
        }
    }
 **/
}

