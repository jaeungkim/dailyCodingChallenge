class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            int val1 = nums1[index1];
            int val2 = nums2[index2];
            if(val1 > val2){
                index2++;
            }
            else if (val1 < val2){
                index1++;
            }
            else{
                list.add(val1);
                index2++;
                index1++;
            }
        }
        int[] returnList = new int[list.size()];
        for( int i = 0; i < list.size(); i++){
            returnList[i] = list.get(i);
        }
        return returnList;
    }
}
