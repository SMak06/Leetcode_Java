import java.util.*;
public class TopKFrequentElements {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            //1. Create a hashmap with item and frequency
            //2. Create a minheap PQ
            //3. Add to the PQ, poll when size grows larger than k
            //4. Append to array
            //5. return
            
            Map<Integer, Integer> map = new HashMap<>();
            
            for(int num : nums) {
                map.put(num, map.getOrDefault(num,0)+1);
            }
            
            PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
            
            for(Map.Entry entry: map.entrySet()) {
                pq.add(entry);
                if(pq.size() > k) pq.poll();
            }
            
            int[] res = new int[k];
            for(int i = 0; i < k; i++) {
                res[i] = pq.poll().getKey();
            }
            return res;
        }
    }
}
