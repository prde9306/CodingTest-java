import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayList 똑바로 활용할 수 있는가.
 */
class Main{

    public ArrayList<Integer> solution(int N, int[]arr){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for(int i=0; i<N-1; i++){
            if(arr[i]<arr[i+1]){
                answer.add(arr[i+1]);
            }
        }
        return answer;
    }

    public static void main (String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }

        for(int x: T.solution(N, arr)){
            System.out.print(x+" ");
        }


    }
}