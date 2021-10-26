import java.util.*;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) map.put(c,i);
            else map.put(c,-1);
        }
        int ans = Integer.MAX_VALUE;
        for(char c: map.keySet()){
            if (map.get(c) < ans && map.get(c) > -1) ans = map.get(c);
        }
        if(ans == Integer.MAX_VALUE) return -1;
        else {System.out.println(ans); return ans;}
    }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
}

