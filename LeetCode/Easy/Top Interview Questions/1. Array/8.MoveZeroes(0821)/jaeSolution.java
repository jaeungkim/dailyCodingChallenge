public class jaeSolution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // {0,1,0,3,12} -> {1,3,12,0,0}
        //
        // move zeros to the end
        int nonzeros = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i]; // store temp value with nonzero iterate
                nums[i] = nums[nonzeros]; // assign nums[i] value with nums[nonzero]
                nums[nonzeros] = temp; // assign nums[nonzero] to temp value that was nonzero
                nonzeros++; // increment zero

            }
        }

    }
}
