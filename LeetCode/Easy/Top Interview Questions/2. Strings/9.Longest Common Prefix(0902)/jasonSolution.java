class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        Boolean changed = true;
        while(prefix.length() != 0 && changed){
            changed = false;
            for(int i = 0; i < strs.length; i++){
                if(strs[i].indexOf(prefix)!=0){
                    prefix = prefix.substring(0, prefix.length()-1);
                    changed = true;
                }
            }
        }
        return prefix;
    }
    
}
