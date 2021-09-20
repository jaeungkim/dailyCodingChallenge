// Brute force solution
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        for(int i = 0 ; i < (haystack.length()-needle.length()+1); i++) {
            
            for(int j = 0; j < needle.length(); j++){
                char h = haystack.charAt(i+j);
                char n = needle.charAt(j);
                if(h != n)
                    break;
                
                if(j == needle.length()-1)
                    return i;
            }
            
        }
        return -1;
    }
}
