package InflearnLecture.chap07DFSBFS;

public class recursive {
    public void DFS(int n) {
        //DFS 는 보통 If,Else로 풀어줘
        if (n == 0) return;
        else {
            System.out.println();
            DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        recursive T = new recursive();
        T.DFS(3);

    }
}
