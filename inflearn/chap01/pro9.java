package inflearn.chap01;

public class pro9 {

    class Main{

        public int solution(String str){
            int answer = 0;
            //char 0이 아스키num 48, 문자 9 는 57
            for(char x : s.toCharArray()){
                if(x>= 48 && x<=57) answer = answer*10+(x-48);
            }
            return answer;

        }

        public static void main (String[]args){
            Main T = new Main();

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLint();

            T.solution(str);


        }
    }
    //sol2
    import java.io.IOException;
import java.util.Scanner;
    class Main{

        public int solution(String str){
            String answer = "";
            for(char x : str.toCharArray()){
                if(Character.isDigit(x)) answer+=x;
            }
            return Integer.parseInt(answer);
        }

        public static void main (String[]args)throws IOException{
            Main T = new Main();

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            System.out.print(T.solution(str));


        }
    }

}
