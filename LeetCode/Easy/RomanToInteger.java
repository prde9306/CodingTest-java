package LeetCode.Easy;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Example 2:
 *
 * Input: s = "IV"
 * Output: 4
 * Example 3:
 *
 * Input: s = "IX"
 * Output: 9
 * Example 4:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

public class RomanToInteger {

    public static int romanToInteger(String s) {
        int result = 0;
        int len = s.length();

        for(int i = 0; i < len -1; i ++) {
            int now = switchRoman(s.charAt(i));
            int next = switchRoman(s.charAt(i +1));
        //여기 이해 잘 밑에를 봐야 이해
            result = now < next ? result - now : result + now;
        }
        //마지막 문자는 안담겨서
        result += switchRoman(s.charAt(len -1));

        return result;
    }

    public static int switchRoman(char c) {
        int result = 0;

        switch(c) {
            case 'I' : result = 1; break;
            case 'V' : result = 5; break;
            case 'X' : result = 10; break;
            case 'L' : result = 50; break;
            case 'C' : result = 100; break;
            case 'D' : result = 500; break;
            case 'M' : result = 1000; break;
        }

        return result;
    }

}
