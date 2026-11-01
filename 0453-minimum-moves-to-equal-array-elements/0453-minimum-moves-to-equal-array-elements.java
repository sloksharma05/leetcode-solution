class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min_ele = Integer.MAX_VALUE;
        for (int x : nums) {
            min_ele = Math.min(x, min_ele);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= min_ele) {
                result += (nums[i] - min_ele);
            } else {
                result += (min_ele - nums[i]);
            }
        }
        return result;
    }
}