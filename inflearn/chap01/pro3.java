package inflearn.chap01;

public class pro3 {
    /**
     * class Main{
     *
     *     public String solution(String str){
     *         //split을 사용하는 것과
     *         String answer="";
     *         int m = Integer.MIN_VALUE;
     *         String[] s = str.split(" ");
     *         for(String x : s){
     *             int len =x.length();
     *             if(len>m){
     *                 m=len;
     *                 answer=x;
     *             }
     *         }
     *         return answer;
     *
     *
     *         //indexOf, substring
     *         String answer ="";
     *         int m = Integer.MIN_VALUE, pos;
     *         //띄어쓰기 위치 발견 못하면 -1리턴하고 띄어쓰기 위치 발견시 그 값 리턴
     *         while((pos=str.indexOf(' '))!=-1){
     *             String tmp = str.substring(0, pos);
     *             int len = tmp.length();
     *             if(len>m){
     *                 m=len;
     *                 answer=tmp;
     *             }
     *             //pos+1 부터 끝까지 잘라내는 것
     *             str = str.substring(pos+1);
     *         }
     *         //indexOf , substring했을 때는 마지막 단어 처리 꼭 해줘야
     *         //마지막 단어는 공백이 없으니까 -1로나오고 끝나버리기 때문에 추가작업 해줘야 함.
     *         if(str.length()>m) answer = str;
     *         return answer;
     *     }
     *
     *     public static void main(String[]args){
     *         Main T = new Main();
     *         Scanner sc = new Scanner(System.in);
     *         String str = sc.nextLine();
     *         System.out.print(T.solution(str));
     *     }
     * }
     */
}
