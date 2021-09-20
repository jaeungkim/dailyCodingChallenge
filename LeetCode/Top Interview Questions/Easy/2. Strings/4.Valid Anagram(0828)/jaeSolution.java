public class jaeSolution {
    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //Input s = "rat" , t="car" = false
    //Input s = "anagram", t= "nagaram"
    //no idea what anagram is but assuming it contains same letters
    
    
    HashMap<Character,Integer> anagram = new HashMap<>();
    
    if(s.length() != t.length()){ // if not same length return false;
        return false;
    }
    
    for(int i = 0; i < s.length(); i++){
        anagram.put(s.charAt(i), anagram.getOrDefault(s.charAt(i),0)+1);
        anagram.put(t.charAt(i), anagram.getOrDefault(t.charAt(i),0)-1);
    }
    for(char c:anagram.keySet()){
        if(anagram.get(c) != 0){
            return false;
        }
    }

    return true;
}
