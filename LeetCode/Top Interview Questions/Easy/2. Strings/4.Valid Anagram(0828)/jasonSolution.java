// Second Solution (3ms)
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ary = new int[26];
        if(s.length() != t.length())
            return false;
        for( int i = 0 ; i < s.length(); i++){
            ary[s.charAt(i)-'a']++;
            ary[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i < ary.length; i++){
            if(ary[i] != 0)
                return false;
        }
        return true;
    }
}

/*
// First Solution (17ms)

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap hash = new HashMap<Character, Integer>();
        if(s.length() != t.length())
            return false;
        for( int i = 0 ; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(hash.containsKey(sc))
                hash.put(sc, (int) hash.get(sc)+1);
            else 
                hash.put(sc, 1);
            
            if(hash.containsKey(tc))
                hash.put(tc, (int) hash.get(tc)-1);
            else 
                hash.put(tc, -1);
        }
        for(int i = 0; i < s.length(); i++){
            if((int)hash.get(s.charAt(i)) != 0)
                return false;
        }
        return true;
    }
}
*/