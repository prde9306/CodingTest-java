package InflearnLecture.chap01String;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public boolean solution(String str){
        boolean answer;
        //string으로 할 까?
        int lt =0;
        int rt = str.length()-1;
        char[]ch = str.toCharArray();

        while(lt<rt){

            if(ch[lt]==ch[rt]){
                lt++;
                rt--;
            }
            else{
                return false;
            }
        }
        return true;



    }

    public static void main (String[]args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(T.solution(str));
    }

    //
    class Main{

        public String solution(String str){
            String answer ="YES";
            str = str.toUpperCase();
            int len = str.length();
            for(int i=0; i<len/2; i++){
                if(str.charAt(i)!= str.charAt(len-i-1)) return "NO";
            }
            //다른 방식으로
           /**
            String answer ="NO";
            String tmp = new StringBuilder(str).reverse().toString();
            if(str.equalsIgnoreCase(tmp)) answer="YES";
            return answer;
            **/
            return answer;
        }

        public static void main (String[]args){
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(T.solution(str));
        }
    }
}
