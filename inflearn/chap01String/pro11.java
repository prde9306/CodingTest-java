package inflearn.chap01String;

public class pro11 {
    class Main{
        public String soultion(String str){
            String answer="";
            // index outofbound 안 발생하게
            str= str+" ";
            int cnt = 1;
            for(int i=0; i<str.length()-1; i++){

                if(str.charAt(i)==str.charAt(i+1)) {
                    cnt++;

                }else{
                    answer += str.charAt(i);
                    if(cnt>1) answer +=String.valueOf(cnt);
                    cnt =1;
                }
            }
            return answer;
        }



        public static void main(String[]args)throws IOException{
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(T.solution(str));

        }
    }
}
