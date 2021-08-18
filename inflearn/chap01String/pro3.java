package inflearn.chap01String;

import java.util.Scanner;

/**
 * 여기서 핵심은 str의 길이로 최대 길이를 찾은 후 그것에 해당하는 문자를 어떻게 가져오느냐이다.
 */
public  class Main{

     public String solution(String str){

         /**
          * sol1. split을 사용하는 것
          */
              String answer="";
              int m = Integer.MIN_VALUE;
              String[] s = str.split(" ");
              for(String x : s){
                  int len =x.length();
                  if(len>m){
                      m=len;
                      answer=x;
                  }
              }
              return answer;


         /**
          *  sol2. indexOf, subString을 사용하는 것
          */

         String answer2 ="";
              int m2 = Integer.MIN_VALUE, pos;
              //띄어쓰기 위치 발견 못하면 -1리턴하고 띄어쓰기 위치 발견시 그 값 리턴
              while((pos=str.indexOf(' '))!=-1){
                  String tmp = str.substring(0, pos);
                  int len = tmp.length();
                  if(len>m2){
                      m=len;
                      answer=tmp;
                  }
                  //pos+1 부터 끝까지 잘라내는 것(인덱스 번호 잘봐)
                  str = str.substring(pos+1);
              }
              //indexOf , substring했을 때는 마지막 단어 처리 꼭 해줘야
              //마지막 단어는 공백이 없으니까 -1로나오고 끝나버리기 때문에 추가작업 해줘야 함.
              if(str.length()>m) answer = str;
              return answer;
          }

          public static void main(String[]args){
              Main T = new Main();
              Scanner sc = new Scanner(System.in);

              //next가 아니야!!!!! nextInt, next, nextLine철저히 구분
              String str = sc.nextLine();
              System.out.print(T.solution(str));
          }
      }

}
