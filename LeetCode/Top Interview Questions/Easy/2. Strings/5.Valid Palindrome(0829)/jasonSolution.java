class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String onlyLetters = "";
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z' )||(c >= '0' && c <= '9'))
                onlyLetters +=  c+"";
        }
        
        for(int i = 0; i < onlyLetters.length()/2; i++){
            if(onlyLetters.charAt(i)!= onlyLetters.charAt(onlyLetters.length()-1-i))
                return false;
        }
        return true;
    }
}
