package LeetCode.Easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Example 4:
 *
 * Input: x = -101
 * Output: false
 *
 */
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
    public boolean isPalindrome2(int x) {
        if(x<0) return false;
        String ispalin=Integer.toString(x);
        int lindex=ispalin.length()-1;

        int findex=0;
        // comparing first and last index of string character
        while(findex<lindex)
        {
            if(ispalin.charAt(findex)!=ispalin.charAt(lindex))
            {
                return false;
            }
            findex++;
            lindex--;
        }
        return true;
    }

}
