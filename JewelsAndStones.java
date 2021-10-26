
import java.util.*;
public class JewelsAndStones {
   
    
    public int numJewelsInStones(String jewels, String stones) {
        // HashSet<Character> ch = new HashSet<>();
        // for (char c : jewels.toCharArray()) {
        //     ch.add(c);
        // }
        // int count = 0;
        // for (char s : stones.toCharArray()) {
        //     if (ch.contains(s) == true) {
        //         count++;
        //     }
        // }
        // return count;
        
        
        
        
        int count = 0;
        HashSet<Character> jew =new HashSet<>();
        for(int i = 0; i< jewels.length();i++) jew.add(jewels.charAt(i));
        for(int i = 0; i< stones.length();i++) {
            char c= stones.charAt(i);
            if(jew.contains(c))
                count++;
        }
        return count;
        
    }
}
