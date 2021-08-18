package inflearn.chap02Array;

public class pro11 {
    public int solution(int n, int[][]arr){
        int answer =0, max =Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; j<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[]args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; j<=N; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(T.solution(N, arr));
    }

    //sol2 이렇게 하면 안되나?
    /**
     * class Main{
     *
     *     //3중 포문 도는 메커니즘, flag처리, index 밖으로 나가지 않게
     *     public int[] solution (int N, int[][]arr){
     *         int []answer =new int[5];
     *         for(int i=0; i<N; i++){
     *             for(int j=0; j<N; j++){
     *                 for(int k=0; k<5; k++){
     *                 if(k!=j && arr[j][i]==arr[k][i]){
     *                     answer[k]+=1;
     *                 }
     *             }
     *             break;
     *             }
     *         }
     *         Arrays.sort(answer);
     *
     *         return answer[4];
     *     }
     *
     *     public static void main(String[]args) throws IOException{
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         int N = sc.nextInt();
     *         int [][]arr= new int[N][N];
     *         for(int i=0; i<N; i++){
     *             for(int j=0; j<N; j++){
     *                 arr[i][j]=sc.nextInt();
     *             }
     *         }
     *         for(int x:  T.solution(N, arr) )
     *
     *
     *
     *     }
     * }
     */
}
