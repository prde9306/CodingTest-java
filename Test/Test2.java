package Test;

public class Test2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
            long res = 0;

            while (x != 0) {
                res *= 10;
                res += x % 10;
                x = x / 10;
            }
            if(res == x){
                return true;
            }else {
                return false;
            }
        }
    }

