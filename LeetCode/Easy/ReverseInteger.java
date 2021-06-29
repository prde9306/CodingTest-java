package LeetCode.Easy;
/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 * Example 4:
 *
 * Input: x = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class ReverseInteger {

//평범하게 1 의 자릿수부터 더해가면 된다.
//한 가지 주의할 점은 res 값이 int 의 범위를 벗어날 수 있기 때문에 long 타입으로 선언 후에 나중에 바꿔야 함.

    public int reverse(int x) {
        long res = 0;

        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }

        if (-Integer.MAX_VALUE <= res && res <= Integer.MAX_VALUE) {
            return (int) res;
        } else {
            return 0;
        }
    }
}
