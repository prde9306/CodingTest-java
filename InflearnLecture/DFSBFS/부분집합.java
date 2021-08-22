package InflearnLecture.DFSBFS;

public class 부분집합 {

    static int n;
    //이 숫자를 부분집합으로 사용하는지 안하는지 check
    static int[] ch;
    //L이라는 숫자를 원소로 사용하는지 안하는지 뻗어나간다.
    public void DFS(int L){
        //if-else로, 종착점에 왔을 때 , DFS는 if-else거의 다 풀림
        if(L==n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0)System.out.println(tmp);

        }else {
            //왼쪽으로 뻗고, 뻗기 전에 사용여부
            ch[L]=1;
            DFS(L+1);
            //오른쪽으로 뻗고
            ch[L]=0;
            DFS(L+1);
        }

    }
    public static void main(String[]args){
        부분집합 T = new 부분집합();
        n =3;
        //check배열을 원소를 인덱스번호로
        ch = new int[n+1];
        T.DFS(1);

    }

}
