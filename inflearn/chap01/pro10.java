package inflearn.chap01;

public class pro10 {
    import java.io.IOException;
import java.util.Scanner;

    class Main{

        public int[] solution(String str, Character target){
            int [] answer = new int[str.lenght()];
            int p=1000;

            for(int i=0; i<str.length();i++){
                if(str.charAt(i)==target){
                    p=0;
                    answer[i]=p;
                }else{
                    p++;
                    answer[i]=p;
                }
            }
            p=1000;
            for(int i= str.length()-1; i>=0; i--){
                if(str.charAt(i)==t){
                    p=0;
                }else{
                    p++;
                    answer[i]= Math.min(answer[i], p);
                }
            }
            return answer;
        }

        public static void main (String[]args)throws IOException{
            Main T = new Main();

            Scanner sc = new Scanner(System.in);

            String str = sc.next();
            Character target = sc.next().charAt(0);
            for(int x: T.solution(str, target)){
                System.out.print(x+" ");
            }

        }
    }
}
