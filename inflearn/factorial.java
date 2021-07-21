package inflearn;

public class factorial {

    public int DFS(int N){
        if(N==1) return 1;
        else return N*DFS(N-1);
    }
    public static void main(String[]args){
        factorial f = new factorial();
        System.out.println(f.DFS(5));
    }
}
