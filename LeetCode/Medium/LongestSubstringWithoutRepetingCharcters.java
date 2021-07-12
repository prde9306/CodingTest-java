package LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

//sol1 새로운 함수를 만들어야
//이건 시간초과
public class LongestSubstringWithoutRepetingCharcters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j))
                    ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch))
                return false;
            set.add(ch);
        }
        return true;
    }
    //sol2

        public int lengthOfLongestSubstring2(String s) {
            // 한 글자씩만 나와야한다. ex, abca 는 a 가 두번나오므로 안된다.
            int maxLength = 0;
            int i=0, j=0;
            int length = s.length();
            HashSet<Character> stringSet = new HashSet<>();

            while (j < length) {
                if(i > j) break;
                if (!stringSet.contains(s.charAt(j))){
                    stringSet.add(s.charAt(j++));
                    maxLength = Math.max(maxLength, j - i);
                    continue;
                }
                stringSet.remove(s.charAt(i++));

            }

            return maxLength;
        }


}

