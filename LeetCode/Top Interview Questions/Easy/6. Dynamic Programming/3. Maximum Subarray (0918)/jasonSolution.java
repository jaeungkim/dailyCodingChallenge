class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int max = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            maxSum = Math.max(nums[i], maxSum + nums[i]);
            max = Math.max(max, maxSum);
        }
        return max;
    }
}
