package InflearnLecture.chap07DFSBFS;

public class 미로 {
    //미로찾기도 전형적인 풀이 암기
    /**
     * class Main{
     *     //이건 일일이 스텍 같은거 따지지마 따질 수 없어- 대략적인 개념만
     *
     *     static int[] dx ={-1, 0, 1, 0};//12시, 3시, 6시, 9시 순서 (x 행, y열)
     *     static int[] dy ={0, 1, 0, -1};
     *     static int[][]board;
     *     static int answer =0;
     *
     *
     *     public void DFS(int x, int y){
     *         if(x==7 && y==7) answer++;
     *         else(
     *             for(int i=0; i<4; i++){
     *                 int nx = x+dx[i];
     *                 int ny = y+dy[i];
     *                 if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
     *                     board[nx][ny]=1;
     *                     DFS(nx, ny);
     *                     board[nx][ny]=0;
     *                 }
     *             }
     *         )
     *
     *     }
     *
     *     public static void main (String[]args){
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         board = new int[8][8];
     *         for(int i=1; i<=7; i++){
     *             for(int j=1; j<=7; j++){
     *                 board[i][j]= sc.nextInt();
     *             }
     *         }
     *         board[1][1]=1;
     *         T.DFS(1,1);
     *         System.out.print(answer);
     *
     *     }
     */
}
