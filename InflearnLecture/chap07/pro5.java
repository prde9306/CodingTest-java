package InflearnLecture.chap07;

public class pro5 {

    /**
     * import java.util.Scanner;
     *
     * // 서로소 집합
     * //Union, find 알고리즘 암기해야한다.
     * class Main{
     *     static int []unf;
     *     //Find 이렇게 처리하는 것 암기해야 한다.
     *     public static int Find(int v){
     *         //find v  의 집합 번호를 리턴
     *
     *         if(v==unf[v]) return v;
     *         else return unf[v]=Find(unf[v]);
     *
     *     }
     *     public static void Union(int a, int b){
     *         int fa = Find(a);
     *         int fb = Find(b);
     *         if(fa!=fb) unf[fa]=fb;
     *
     *     }
     *
     *     public static void main(String[]args){
     *         Scanner sc = new Scanner(System.in);
     *         int n = sc.nextInt();
     *         int m = sc.nextInt();
     *
     *         unf = new int[n+1];
     *         for(int i=1; i<=n; i++) unf[i]=i;
     *         for(int i=1; i<=m; i++){
     *             int a = sc.nextInt();
     *             int b = sc.nextInt();
     *             //a와 b를 한 집합으로 만들어라
     *             Union(a, b);
     *         }
     *
     *         //마지막 친구관계인지 확인
     *         int a = sc.nextInt();
     *         int b = sc.nextInt();
     *         int fa = Find(a);
     *
     *         if(fa==fa) System.out.println("YES");
     *         else System.out.println("NO");
     *
     *     }
     *
     *
     *
     * }
     */

}
