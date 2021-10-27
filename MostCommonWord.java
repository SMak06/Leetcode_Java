import java.util.*;
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hs = new HashSet();
        HashMap <String, Integer> map = new HashMap();
        for (String s : banned){
            hs.add(s);
        }
        String[] para = paragraph.toLowerCase().split("\\W+");
        
        for(String p : para){
            if(!hs.contains(p)) {
                map.put(p, map.getOrDefault(p,0)+1);
            }
        }
        int max = 0;
        String res = "";
        
        for(String r: map.keySet()) {
            if(map.get(r) > max){
                max = map.get(r);
                res = r;
            }
        }
        return res;
    }
}
