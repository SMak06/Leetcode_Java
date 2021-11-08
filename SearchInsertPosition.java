public class SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int curr, left = 0, right = nums.length - 1;
            while (left <= right) {
                curr = left + (right - left) / 2;
              if (nums[curr] == target) return curr;
              if (target < nums[curr]) right = curr - 1;
              else left = curr + 1;
            }
            return left;
        }
    }
}
