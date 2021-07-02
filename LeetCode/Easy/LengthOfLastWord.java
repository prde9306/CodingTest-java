package LeetCode.Easy;

public class LengthOfLastWord {
    //sol1
    //공백도 문자로 인식한다, 거꾸로 for문, 배열길이vs, String길이
    public int lengthOfLastWord(String s) {

        for(int i=s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)==' '){
                return s.length()-i-1;
            }
        }
        return s.length();
    }
}
