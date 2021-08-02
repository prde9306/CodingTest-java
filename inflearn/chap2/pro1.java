package inflearn.chap2;


public class pro1 {

    class Main{

        public ArrayList<Integer> solution(int n, int[]arr){
            ArrayList<Integer> answer = new ArrayList<>();
            answer.add(arr[0]);
            for(int i=1; i<N; i++){
                if(arr[i]> arr[i-1]) answer.add(arr[i]);

                return answer;

            }
        }
        public static void main(String[]args)throws IOException{
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int []arr  = new int[N];

            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            for(int x : T.solution(n, arr)){
                System.out.print(x+" ");
            }
        }
    }
}
