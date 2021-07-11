package Test;

public class Test3 {
    public static int romanToInteger(String s) {
        int result = 0;
        int len = s.length();

        for (int i = 0; i < len - 1; i++) {
            int now = switchRoman(s.charAt(i));
            int next = switchRoman(s.charAt(i + 1));

            result = now < next ? result - now : result + now;
        }
        result += switchRoman(s.charAt(len - 1));

        return result;
    }


    public static int switchRoman(char c) {
        int result = 0;

        switch(c) {
            case 'I' :
                result = 1;
                break;
            case 'V' :
                result = 5;
                break;
            case 'X' :
                result = 10;
                break;
            case 'L' :
                result = 50;
                break;
            case 'C' :
                result = 100;
                break;
            case 'D' :
                result = 500;
                break;
            case 'M' :
                result = 1000;
                break;
        }

        return result;
    }
}
