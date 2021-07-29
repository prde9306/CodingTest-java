package inflearn.chap01;

public class pro5 {
    /**
     * class Main{
     *     public String solution(String str){
     *         String answer;
     *         char [] s = str.toCharArray();
     *         int lt =0;
     *         int rt = str.length()-1;
     *
     *         while(lt<rt){
     *             //알파벳인지 여부 확인하는 것
     *             if(!Character.isAlphabetic(s[lt])) lt++;
     *             else if(!Character.isAlphabetic(s[rt]))rt--;
     *             else
     *             char tmp = s[lt];
     *             s[lt]=s[rt];
     *             s[rt]=tmp;
     *             lt++;
     *             rt--;
     *         }
     *     }
     *     answer = String.valueOf(s);
     *     return answer;
     *
     *     public static void main(String[]args)throwsIOException{
     *         Scanner sc = new Scanner(System.in);
     *         String str = sc.next();
     *
     *         System.out.print(T.solution(str));
     *     }
     * }
     */
}
