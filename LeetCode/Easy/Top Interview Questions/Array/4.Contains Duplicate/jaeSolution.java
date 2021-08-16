public class jaeSolution {
    //Given an integer array nums, 
    //return true if any value appears at least twice in the array, 
    //and return false if every element is distinct.
    //ex) Input: nums = [1,2,3,1]
    //output: true (duplicate exists)

    public boolean containDuplicate(int[] nums) {

        //need nested loop to go through all array elements with each index
        for(int i=0; i<nums.length; i++){ //i=0,1,2,3 , nums.length = 4 (4 times)
            for(int j=1; j<nums.length; j++){ //j=1,2,3, (3 times)
                if(nums[i] == nums[j]){ // compare nums[0] with nums[1] , nums[2] , nums[3]
                    return true;
                }
            }
            return false;
        }
    }
}
