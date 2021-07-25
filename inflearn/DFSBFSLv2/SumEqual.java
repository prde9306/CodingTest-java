package inflearn.DFSBFSLv2;

public class SumEqual {
    /**
     * //합이 같아야 하고, 서로 중복된 원소를 가지면 안된다.
     * //YES or NO 찍어라
     *
     * class Main{
     *     static String answer ="NO";
     *     static int n, total=0;
     *     boolean flag = false; // yes가 발견되면 그다음 제귀들 다 리턴시키게
     *     public void DFS(int L, int sum, int[]arr){
     *             if(flag == true) return;//flag가 true로 되면 다 리턴시켜라
     *             if(sum>total/2) return;
     *             if(L==n){
     *                 if(total-sum)==sum){
     *                     answer="YES";
     *                     flag =true;
     *                 }
     *             else{
     *                 DFS(L+1, sum+arr[L], arr);
     *                 DFS(L+1, sum, arr);
     *             }
     *     }
     *
     *     public static void main(String[]args){
     *         Main T = new Main();
     *         Scanner kb = new Scanner(System.in);
     *         n = kb.nextInt();
     *         int [] arr = new int[n];
     *
     *         for(int i=0; i<n; i++){
     *             arr[i]=kb.nextInt();
     *             total +=arr[i];
     *         }
     *         T.DFS(0,0, arr);
     *         System.out.println(answer);
     *     }
     * }
     */

}
