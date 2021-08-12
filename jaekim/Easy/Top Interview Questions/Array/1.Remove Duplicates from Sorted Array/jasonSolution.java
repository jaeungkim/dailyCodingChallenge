import java.util.Hashtable;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int prevInt = nums[0];
        int pos = 1;
        for( int i = 1; i < nums.length; i++){
            int currInt = nums[i];
            if(prevInt == currInt){}
            else {
                nums[pos] = currInt;
                pos++;
            }
            prevInt = currInt;
        }
        
        return pos;
    }
}