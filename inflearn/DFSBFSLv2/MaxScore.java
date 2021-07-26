package inflearn.DFSBFSLv2;

public class MaxScore {

    /**
     * class Main{
     *     static int Ltime;
     *     static int[] score;
     *     static int[] time;
     *     static int Level = 0;
     *
     *
     *     //Math.max()로 최대 점수 구하고
     *     // 일단 기준은 시간으로 나눠야 한다.
     *     public void DFS(int Level, int total){
     *         if(Ltime<=total) return;
     *
     *
     *         DFS(Level+1, total+time[Level+1]);
     *         DFS(Level+1, total);
     *
     *     }
     *
     *     public static void main(Stirng[]args)throws IOException{
     *
     *         Scanner sc = new Scanner(System.in);
     *
     *         int N = sc.nextInt();
     *         Ltime = sc.nextInt();
     *
     *         for(int i=0; i<N; i++){
     *             score[i]=sc.nextInt();
     *             time[i]=sc.nextInt();
     *         }
     *
     *
     *
     *
     *
     *
     *     }
     * }
     *
     * class Main{
     *     static int answer = Integer.MIN_VALUE, n, m;
     *     boolean falg =false;
     *     public void DFS(int L, int sum, int time, int[]ps, int[]pt){
     *        if(time>m) return;
     *        if(L==n){
     *            answer = Math.max(answer, sum);
     *
     *        } else{
     *             DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
     *             DFS(L+1, sum, time, ps, pt);
     *
     *        }
     *     }
     *
     *
     *     public static void main(String[]args)throws IOException{
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         n= sc. nextInt();
     *         m = sc,nextInt();
     *
     *         int[] a = new int[n];
     *         int []b = new int [n];
     *
     *         for(int i=0; i<n; i++){
     *             a[i] = sc.nextInt();
     *             b[i] = sc.nextInt();
     *         }
     *         T.DFS(0,0,0,a,b);
     *         System.out.println(answer);
     *     }
     * }
     */

}
