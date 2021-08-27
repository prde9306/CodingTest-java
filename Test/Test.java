import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//들어 올 때마다 확인해야 뒤에 있는지 여부
//이중 포문임
class Main{
    static int[]arr;

    public boolean bisearch(int N){

        boolean answer = false;
        int lt =0;
        int rt = arr.length-1;
        int m = (lt+rt)/2;

        while(lt<=rt){
            if(N > arr[m]){ lt = m+1;}
            else if(N < arr[m]) {rt = m-1;}
            else answer= true;
        }
        return answer;
    }

    public ArrayList<Integer> solution(int M, int[]target){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<M; i++){
            if(bisearch(target[i])) answer.add(1);
            else{
                answer.add(0);
            }
        }
        return answer;
    }
    public static void main(String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N];
        int []target = new int[M];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<M; i++){
            target[i]= sc.nextInt();
        }
        for(int x : T.solution(M, target))System.out.println(x);
    }
}