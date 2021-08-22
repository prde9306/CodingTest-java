package InflearnLecture.chap03TwoPointer;

public class pro6 {
    /**
     * sol1 TwoPointer알고리즘
     *
     * class Main{
     *
     *     public int solution(int N){
     *         int answer =0, lt =0;
     *         int sum=0;
     *         int m =n/2 +1;
     *
     *         for(int rt=0; rt<m; rt++){
     *             sum+=rt;
     *             if(sum==m) answer++;
     *
     *             while(sum>m){
     *                 sum -= lt++;
     *                 if(sum==m) answer++;
     *             }
     *         }
     *         return answer;
     *     }
     *
     *     public static void main(String[]args) throws IOException{
     *         Main T = new Main();
     *
     *         Scanner sc = new Scanner(System.in);
     *         int N = sc.nextInt();
     *
     *         System.out.print(T.solution(N));
     *
     *     }
     * }
     */

    //sol2 이중포문으로 절대 풀지마
/**

    public int solution(int N){
        //수학으로 풀기(몫, 나머지로 풀기)

        cnt = 연속된 자연수의 갯수
        int answer =0, cnt=1;
        n--;
        whiel(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnot==0) answer++;
        }

    }
**/

}

