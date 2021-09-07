class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0 ; i--){
            if(digits[i] == 9 && i == 0){
                int[] newAry = new int[digits.length+1];
                newAry[0] = 1;
                return newAry;
            }
            else if(digits[i] == 9){
                digits[i] = 0;
            }
            else {
                digits[i] += 1;
                return digits;
            }
        }
        return digits;
    }
}
