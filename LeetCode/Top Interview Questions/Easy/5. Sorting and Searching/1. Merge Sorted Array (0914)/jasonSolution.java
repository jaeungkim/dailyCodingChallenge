class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return ;
        
        int i1 = m-1;
        int i2 = n-1;
        for(int i = nums1.length-1;  i >= 0; i--){
            
            if(i1 == -1 || nums1[i1] <= nums2[i2]){
                nums1[i] = nums2[i2];
                i2--;
                if(i2 == -1)
                    return ;
            }
            else {
                nums1[i] = nums1[i1];
                i1--;
            }
        }
    }
}
