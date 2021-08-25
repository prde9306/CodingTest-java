package InflearnLecture.chap07DFSBFS;

public class 피보나치 {
    //재귀, 배열로 짜보라는 인터뷰 많이 나옴
    //배열, For문이 성능 더 좋음 -> 재귀는 stack프레임이니까 메모리 많이 씀

    public int DFS(int N){
        if(N==1)return 1;
        else if(N==2)return 1;
        else return DFS(N-2) +DFS(N-1);
    }
    public static void main(String[]args){
        피보나치 f = new 피보나치();
        int n = 7;
        for(int i=1; i<=n; i++)System.out.print(f.DFS(i)+" ");
    }

    //위처럼 다 계속 DFS 호출해서 출력하게하지 말고
    // 한 번만 호출해서 중간중간에 배열에 기록해두기

    static int[]fibo;
    public int DFS(int n){
        //이렇게 이미 구해진 값 갖다 쓰는 게 성능 훨씬 좋다.
        if(fibo[n]>0) return fibo[n];
        if(n==1)return fibo[n]=1;
        else if(n==2)return fibo[n]= 1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[]args){
        부분집합 T = new 부분집합();
        int n =10;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<n; i++)System.out.print(fibo[i]+" ");
    }

    //
}
