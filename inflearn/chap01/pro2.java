package inflearn.chap01;

public class pro2 {
    /**
     * class Main{
     *
     *     public String solution(String []in){
     *         String answer="";
     *
     *         for(char x : str.ToCharArray()){
     *             if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
     *             else answer+= Character.toLowerCase(x);
     *         }
     *         return answer;
     *
     *         //ASCII로 해도 된다.
     *         //대문자 65~90
     *         //소문자 97~122
     *         //(32 차이남)
     *         for(char x : str.ToCharArray()){
     *             //대문자
     *             if(x>=65&& x<=90) answer+=(char)(x-32);
     *             else answer+=(char)(x+32);
     *         }
     *
     *         return answer;
     *
     *
     *     }
     *
     *
     *
     *     public static void main(String[]args){
     *         Main T = new Main();
     *
     *         Scanner sc = new Scanner(System.in);
     *         String str= sc.next();
     *         System.out.println(T.solution(str));
     *     }
     * }
     */
}
