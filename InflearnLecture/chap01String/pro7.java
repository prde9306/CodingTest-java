package InflearnLecture.chap01String;

import java.io.IOException;
import java.util.Scanner;

class Main{

    //sol1(내풀이 거의 암기식으로 튀어나옴)

    public String solution(String str){
        String answer ="YES";
        char[]arr = str.toCharArray();
        int lt =0;
        int rt = arr.length-1;

        while(lt<rt){
            if(arr[lt]==arr[rt]){
                lt++;
                rt--;
            }
            else{
                return "NO";
            }
        }
        return answer;

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();

        System.out.println(T.solution(str));
    }
}

    //sol2 이렇게 뒤에서 끌어오는 것도 방법 확실히 알기
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


