import java.io.IOException;
import java.util.Scanner;

class Main{

    //이중 포문으로 풀면 시간제한결러
    //sol1 이렇게 풀어도 되고

    public int solution(int N, int[]arr){
        int answer =1, max =arr[0];
        for(int i=1; i<N; i++){
            if(arr[i]> max) answer++;
            max = arr[i];
        }
        return answer;
    }

    //sol2 이렇게 풀어도 된다. 메커니즘은 동일함.
    public int solution2(int N, int[]arr){

        int answer =1;

        //최고 큰 키를 가진 사람 어디에 저장해놔야 할 듯?
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(max<arr[i+1]){
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[]args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[]arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(T.solution(N, arr));
    }
}