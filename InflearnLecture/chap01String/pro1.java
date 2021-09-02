package InflearnLecture.chap01String;

import java.util.Scanner;

public class pro1 {
    /**
     * 두 번째 풀 때 Character 뽑아오는 거 생각 못함.
     * 세 번째 풀 때 Uppercase, LowerCase 바꾸는 것 자유자재로 써먹을 수 있어야 한다.
     */
}
      class Main{
          public int solution(String str, char t){
            int answer=0;

              //대문자로 다 바꿔
              str = str.toUpperCase();
              t = Character.toUpperCase(t);

              //foreach에서는 여기 : 뒤에 String 못옴 배열이나 collectionframework만 올 수 있다.
              //여기서는 배열로 되게 .toCharArray로 바꿈
              for(char x : str.toCharArray()){
                  if(x==t)answer++;
              }

            //이렇게 할 수도 있음
              for(int i=0; i<str.length(); i++){
                  if(str.charAt(i)==t)answer++;
            }

     return answer;

}
     public static void main(String[]args){
        Main T=new Main();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //여기 이렇게 뽑아오는 것
        char c=sc.next().charAt(0);
        System.out.print(T.solution(str,c));
        }



}
//sol2 똑같은 방식
/**
 import java.io.IOException;
 import java.util.Scanner;

 class Main{

 public int solution(String str, char ch){
 int answer =0;
 for(char x : str.toCharArray()){
 if(Character.toUpperCase(x)==Character.toUpperCase(ch)){
 answer++;
 }
 }
 return answer;
 }

 public static void main(String[] args) throws IOException{

 Main T = new Main();
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 char ch = sc.nextLine().charAt(0);
 System.out.print(T.solution(str, ch));
 }
 }


 */
