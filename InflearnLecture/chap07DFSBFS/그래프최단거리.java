package InflearnLecture.chap07DFSBFS;

public class 그래프최단거리 {
    /**
     * class Main{
     *     static int M, N, answer=0;
     *     static ArrayList<ArrayList<Integer>> graph;
     *     static int [] ch;
     *
     * public void DFS(int v){
     *     if(v==n) answer++;
     *     else{
     *         //ArrayList은 인접리스트에서
     *         for(int nv : graph.get(v)){
     *             if(ch[nv]==0)
     *             ch[nv]=1;
     *             DFS(nv);
     *             ch[nv]=0;
     *         }
     *     }
     *
     *
     *     }
     *
     * public static void main(String[]args){
     *     Main T = new Main();
     *     Scanner sc = new Scanner(System.in);
     *     int M = sc.nextInt();
     *     int N = sc.nextInt();
     *
     *     graph = new ArrayList<ArrayList<Integer>>;
     *     //객체생성을 이렇게 꼭해줘야 한다.
     *
     *     for(int i=0, i<=n; i++){
     *         graph.add(new ArrayList<Integer>());
     *     }
     *     ch = new int[n+1];
     *
     *     for(int i=0; i<N; i++){
     *         int a = sc.nextInt();
     *         int b = sc.nextInt();
     *         graph.get(a).add(b);
     *     }
     *     ch[1]=1;
     *     T.DFS(1);
     *     System.out.println(answer);
     *
     * }
     * }
     */
}
