package inflearn.chap01;

import java.util.Scanner;

public class pro2 {
    /**
     * Uppercase, LowerCase어떻게 바꾸는지 잘봐 IDE도움없이 Primitive, Wrapper
     */

      class Main{

          public String solution(String str){

              String answer="";

              char[] ch = str.toCharArray();

              for(char x : str.toCharArray()){
                  if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
                  else answer+= Character.toLowerCase(x);
              }
              return answer;

              //ASCII로 해도 된다.
              //대문자 65~90
              //소문자 97~122
              //(32 차이남)
              for(char x : str.toCharArray()){
                  //대문자로
                  if(x>=97&& x<=122) answer+=(char)(x-32);
                  else answer+=(char)(x+32);
              }
              return answer;
          }

          public static void main(String[]args){
              Main T = new Main();

              Scanner sc = new Scanner(System.in);
              String str= sc.next();
              System.out.println(T.solution(str));
          }
      }

}
