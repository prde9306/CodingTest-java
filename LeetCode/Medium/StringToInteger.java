package LeetCode.Medium;

public class StringToInteger {

    //Integer.parseInt(String numberString);
    //Integer.toString(int intNumber)

    public int myAtoi(String str) {
        if(str == null || str.length() == 0)
            return 0;

        int ptr = 0, sign = 1, ans = 0;
        //space지우기
        while(ptr< str.length() && str.charAt(ptr) == ' ')
            ptr++;
        //전체가 빈 공백이라면
        if(ptr >= str.length())
            return 0;
        //첫번 째 char이 +인지 -인지  +면 sign 1로 -면 sign -로
        if(str.charAt(ptr) == '+')
            ptr++;

        else if(str.charAt(ptr) == '-'){
            sign = -1;
            ptr++;
        }

        int validStartCount = 0;

        //여기 325를 앞에서 하나씩 때서 325만드는 과정이다.
        while(ptr < str.length() && Character.isDigit((str.charAt(ptr)))){

            int num = str.charAt(ptr) - '0';
            int temp = ans;
            ans = 10*ans + num;

            if(ans != 0) validStartCount ++; //skip validate 000 000 000 until number reach 214 748 364

            if(validStartCount > 9 && (ans<0 || (ans-num)/10 != temp) ) //Addition Overflow will change sign in ans
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            ptr++;
        }
        return sign * ans;
    }

}
