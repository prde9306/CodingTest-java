package inflearn.chap01String;

public class pro12 {
    class Main{

        public String solution(Int N, String str){
            String answer ="";
            for(int i=0; i<N; i++){
                String tmp =str.substring(0,7).replace('#', '1').replace('*', '0');
                int num = Integer.parseInt(tmp, 2);
                answer += (char)num;
                str =str.substring(7);
            }

            return answer;
        }

        public static void main(String[]args)throws IOException{

            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String str = sc.nextLine();
            System.out.println(T.solution(N, str));




        }
    }

}
