package inflearn.DFSBFSLv2;

public class PermutationGuess {
    /**
     * class Main{
     *     static int [] combination, permutation, ch;
     *     static int n, f;
     *     boolean flag = false;
     *     int[][]dy = new int[35][35];
     *
     *     public int combi(int n, int r){
     *         if(dy[n][r]>0) return d[r][y];
     *         if(n==r||r==0) return 1;
     *         else return dy[n][r]=combi(n-1, r-1) + combi(n-1,r);
     *     }
     *     public void DFS(int L, int sum){
     *         if(flag) return;
     *         if(L ==n){
     *             if(sum==f){
     *                 for(int x = permutation)System.out.print(x+" ");
     *                 flag = true;
     *             }
     *
     *         }else{
     *             for(int i=1; i<n; i++){
     *                 if(ch[i]==0){
     *                     ch[i]=1;
     *                     permutation[L]=i;
     *                     DFS(L+1, sum+permutation[L]*combination[L]);
     *                     ch[i]=0;
     *                 }
     *             }
     *         }
     *
     *     }
     *
     *     public static void main (String[]args){
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *          n = sc.nextInt();
     *          f = sc.nextInt();
     *          combination = new int[n];
     *         permutation = new int[n];
     *         ch = new int[n+1];
     *         for(int i=0; i<n; i++){
     *             combination[i] = T.combi(n-1, i);
     *         }
     *
     *         T.DFS(0,0);
     *
     *     }
     * }
     */
}
