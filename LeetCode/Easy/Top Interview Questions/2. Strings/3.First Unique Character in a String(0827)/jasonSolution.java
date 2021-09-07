class Solution {
    public int firstUniqChar(String s) {
        HashMap hash = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(hash.containsKey(curr)){
                hash.put(curr, -1);
            }
            else{
                hash.put(curr, i);
            }
        }
        for(int i = 0; i < s.length(); i++){
            int val = (int) hash.get(s.charAt(i));
            if(val != -1)
                return val; 
        }
        return -1;
    }
}