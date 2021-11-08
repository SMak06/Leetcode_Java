public class ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            // return (int)(Math.sqrt(2*(long)n +0.25)-0.5);
            
    //         int i = 1;
    //         while(n-i>=0){
    //             n -= i;
    //             i++;
    //         }
    
    //         return i-1;
            
            long left = 0, right = n;
            long curr, k;
            while (left<=right) {
                k = left + (right-left) / 2;
                curr = k * (k + 1) / 2;
                if (curr == n) return (int)k;
                
                else if (n < curr) right = k-1;
                else left = k + 1;
            }
            return (int) right;
            
        }
    }
}
