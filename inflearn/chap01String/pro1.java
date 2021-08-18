package inflearn.chap01String;

import java.util.Scanner;

public class pro1 {
    /**
     * 두 번째 풀 때 Character 뽑아오는 거 생각 못함.
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
