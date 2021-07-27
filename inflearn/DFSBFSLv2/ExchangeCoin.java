package inflearn.DFSBFSLv2;

public class ExchangeCoin {
    /**
     * //중복 순열과 비슷
     * class Main{
     * static int N, target, answer = Integer.MAX_VALUE;
     * static int target;
     *
     *     public int DFS(int L, int SUM, Integer[]arr){
     *         if(sum>target) return;
     *         if(L>=answer) return;
     *         if(sum==target){
     *             answer=Math.min(answer,L);
     *         }
     *         else{
     *             for(int i=0; i<N; i++){
     *                 DFS(L+1, sum+arr[i], arr );
     *             }
     *         }
     *     }
     *
     *     public static void main(String []args) throws IOException{
     *
     *         Main T = new Main();
     *
     *         Scanner sc = new Scanner(System.in);
     *
     *         N = sc.nextInt();
     *         Integer arr[] = new Integer[N];
     *
     *         for(int i=0; i<N; i++){
     *             arr[i]=sc.nextInt();
     *         }
     *         //내림 차순으로
     *         Arrays.sort(arr, Collection.reverseOrder());
     *
     *         target = sc.nextInt();
     *
     *         T.DFS(0,0, arr);
     *     }
     * }
     */





}
