package inflearn.DFSBFSLv2;

public class Permutation {
    /**
     * class Main{
     *     static int N, M ;
     *     static int []arr ;
     *     static int []answer ;
     *     static int []ch ;
     *
     *     public void DFS(int L){
     *         if(L==M) {
     *             for(int x : answer) System.out.print(x+" ");
     *             System.out.println();
     *
     *
     *          }
     *         else{
     *
     *             for(int i=0; i<N; i++){
     *                 if(ch[i]==0)
     *                 answer[L] = arr[i];
     *
     *                  ch[i]=1;
     *
     *                  DFS(L+1);
     *
     *                  ch[i]=0;
     *
     *                 }
     *             }
     *
     *
     *
     *         }
     *
     *     public static void main(String[]args)throws IOException{
     *
     *         Main T = new Main();
     *
     *         Scanner sc = new Scanner(System.in);
     *
     *          N = sc.nextInt();
     *          M = sc.nextInt();
     *
     *         arr = new int[N];
     *         answer= new int[M];
     *         ch = new int[N];
     *
     *          for(int i=0; i<N; i++){
     *              arr[i]=sc.nextInt();
     *          }
     *
     *
     *         T.DFS(0);
     *     }
     * }
     */
}
