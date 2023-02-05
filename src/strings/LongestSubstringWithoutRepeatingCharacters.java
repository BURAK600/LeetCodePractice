package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int getLongestSubstringWithoutRepeatingCharacters(String s){
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        for (int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,right);
            }else {
                left = Math.max(left, map.get(ch)+1);
                map.put(ch,right);
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(getLongestSubstringWithoutRepeatingCharacters("buurakrmu"));
    }
}
