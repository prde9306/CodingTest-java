package LeetCode.Easy;

public class PalindromeNumber {
   //sol1. reverseInteger 응용편,
    public boolean isPalindrome(int x) {
        //음수가 들어올 때 처리 할 것
        if (x < 0) {
            return false;
        }
        int pd = 0;
        int temp= x;

        while (temp != 0) {
            pd *= 10;
            pd += temp % 10;
            temp /= 10;
        }
        if (pd == x) {
            return true;
        } else {
            return false;
        }

    }

    //sol2 striong으로 형변환 해서

}
