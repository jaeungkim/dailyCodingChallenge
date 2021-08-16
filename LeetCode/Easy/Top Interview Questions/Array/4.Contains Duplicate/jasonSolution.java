import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i]))
                return true;
            
            else 
                hash.put(nums[i], true);
            
        }
        return false;
    }
}