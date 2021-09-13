public class jaeSolution {
    // Given a string s, find the first non-repeating character in it and return its
    // index. If it does not exist, return -1.

    // Input: s = "leetcode"
    // Output: 0

    // Input: s = "loveleetcode"
    // Output: 2

    //given a string, find the first non-repeating character in it and return its index
    HashMap<Character, Integer> occurence = new HashMap<>();
    int n = s.length();
    
    for(int i=0; i<n; i++){
        char c = s.charAt(i);//l,e,e,t,c,o,d,e
        //put the occruence with specific character in hashmap
        occurence.put(c, occurence.getOrDefault(c,0) + 1); //see if it occured before, if it didn't + 1
    }
    
    for(int i=0; i<n; i++){
        if(occurence.get(s.charAt(i)) == 1) //if it occured once
            return i;
    }
        
    //else
    return -1;
}
