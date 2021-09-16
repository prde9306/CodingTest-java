package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    //재귀 ..
        class Solution {
            public List<String> generateParenthesis(int n) {
                List<String> res = new ArrayList<>();
                recursive(res, "(", n - 1, n);
                return res;
            }

            public void recursive(List<String> res, String s, int open, int close) {
                if (open == 0 && close == 0) {
                    res.add(s);
                    return;
                }

                if (open > 0) {
                    recursive(res, s + "(", open - 1, close);
                }

                if (close > open) {
                    recursive(res, s + ")", open, close - 1);
                }
            }

            //sol2 https://www.youtube.com/watch?v=qBbZ3tS0McI
            //개념적으로 이해해야지 stack 그리기 어렵다.
        class Solution{
                public List<String> generateParenthesis(int n){
                    List<String> output_arr = new ArrayList<>();
                    backtrack(output_arr, "", 0, 0,n);
                    return output_arr;
                }

            public void backtrack(List<String>output_arr, String current_string,int open, int close, int max){
                if(current_string.length()==max*2){
                    output_arr.add(current_string);
                    return;
                }
                if(open<max) backtrack(output_arr, current_string+"(", open+1, close, max);

                if(close<open) backtrack(output_arr, current_string+")", open, close+1, max);
            }
        }

}
