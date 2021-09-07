import java.util.Arrays;

public class jaeSolution {
    public static void main(String[] args){
        int nums1[] = new int[]{2,2};
        int nums2[] = new int[]{1,2,2,1};
        int temp[] = {};

        //switch array if nums2 is bigger to make nums1 bigger
        if(nums1.length<nums2.length){
            temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        
    }
}
