class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){     
            set.add(nums[i]);
        }
        // -5,-5,-4,-4,-4,-2,-2,-2,0,0,0,1,1,3,4,4
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1])continue;
            int j = i + 1;
            int k = nums.length-1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    tempList.add(nums[k]);
                    list.add(tempList);  
                    while(j < k && nums[j] == nums[j+1])j++;
                    while(j < k && nums[k] == nums[k-1])k--;
                    j++;
                    k--;
                }
                
                else if(sum > 0)
                    k--;
                else 
                    j++;
            }
        }
        return list;
    }
}
