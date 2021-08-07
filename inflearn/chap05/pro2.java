package inflearn.chap05;

public class pro2 {
    /**
     * import java.util.HashMap;
     * import java.util.LinkedList;
     * import java.util.Queue;
     * import java.util.Scanner;
     * import java.util.Stack;
     *
     * class Main{
     *
     *     public String solution(String str){
     *         String answer ="";
     *
     *         Stack<Character> st = new Stack<>();
     *
     *         for(char x : str.toCharArray()){
     *             if(x==')'){
     *                // stack은 꺼낸 걸 리턴 받음 여는 괄호가 나올 때까지 pop
     *                 while(stack.pop()!='(');
     *             }
     *             else{
     *                 st.push(x);
     *             }
     *             //get으로 접근해야 앞에서부터 꺼내올 수있음
     *             for(int i=0; i<stack.size(); i++){ answer +=stack.get(i); }
     *             return answer;
     *         }
     *     }
     *     public static void main(String[]args)throws IOException{
     *         Main T = new Main();
     *
     *         Scanner sc = new Scanner(System.in);
     *         String str =sc.next();
     *         System.out.print(T.solution(A));
     *
     *     }
     * }
     */
}
