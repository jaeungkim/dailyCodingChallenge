// couldn't solve this problem
class Solution {
    public int reverse(int x) {
        String s = "" + x;
        boolean isNegative = false;
        if(s.charAt(0) == '-'){
            isNegative = true;
            s = s.substring(1, s.length());
        }
        char[] ary = s.toCharArray();

        
        for(int i = 0; i < ary.length/2; i++){
            char temp = ary[i];
            ary[i] = ary[ary.length-1-i];
            ary[ary.length-1-i] = temp;
        }
        if(isNegative)
            s = "-";
        else 
            s = "";
        s = s + new String(ary);
        x = Integer.parseInt(s);
        return x;
    }
}
