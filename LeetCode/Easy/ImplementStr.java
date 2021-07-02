package LeetCode.Easy;

public class ImplementStr {
    //sol1. substring 사용
    public int strStr(String haystack, String needle) {
        int len = needle.length();

        for (int i = 0; i < haystack.length() - len + 1; i++) {
            String s = haystack.substring(i, i + len);
            if (s.equals(needle)) {
                return i;
            }
        }
    }


    //sol2. charAt사용
        public int strStr2(String haystack, String needle) {
            int len = needle.length();

            for (int i = 0; i < haystack.length() - len + 1; i++) {
                boolean isEqual = true;

                for (int j = 0; j < len; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        isEqual = false;
                    }
                }

                if (isEqual) {
                    return i;
                }
            }

            return -1;
        }
}

