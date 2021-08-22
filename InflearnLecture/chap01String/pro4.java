package InflearnLecture.chap01String;

public class pro4 {
    //sol1 StringBuilder 이용하기
    /**
     class Main{
     public ArrayList<String> solution(int n, String[]str){
     ArrayList<String> answer = new ArrayList<>();
     //직접 구현하기
     for(String x : str){
     char[] s=x.toCharArray();
     //이런 방식 잘 암기해놔
     int lt=0;, rt =x.length()-1;
     while(lt<rt){
     char tmp = s[lt];
     s[lt]=s[rt];
     s[rt]=tmp;
     lt++;
     rt--;
     }
     String tmp =String.valueOf(s);
     answer.add(tmp);
     }
     return answer;
     }
     //StringBuilder사용하기
     for(String x : str){
     //메소드 써서 뒤집기
     String tmp  = new StringBuilder(x).reverse().toString();
     answer.add(tmp);
     }

     return answer;
     }
     public static void main(String[]args)throws IOException{
     Main T = new Main();

     Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     String [] arr = new String[N];

     for(int i=0; i<N; i++){
     arr[i]=sc.nextLine();
     }
     for(String x : T.solution(n, str)){
     System.out.println(x);
     }
     }
     }


     //sol2 이렇게 하면 안되나??
     class Main{
     public String solution(String str){
     String[]answer1 = str.split("");
     String answer2="";


     for(int i=answer.length-1; i>=0; i--){
     answer2+=answer1[i];
     }
     return answer2;



     }

     public static void main(String[]args)throws IOException{
     Main T = new Main();

     Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     String [] arr = new String[N];

     for(int i=0; i<N; i++){
     arr[i]=sc.nextLine();
     System.out.println(T.solution(arr[i]));
     }
     }
     }
    **/
}
