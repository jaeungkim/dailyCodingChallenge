class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        int[] newAry = Arrays.copyOfRange(nums, nums.length-k, nums.length);
        for(int i = nums.length-1; i >= 0 ; i--){
            int newIndex = i-k;
            if(newIndex < 0){
                nums[i] = newAry[i];
            }
            else {
                nums[i] = nums[newIndex];
            }
        }
    }
}