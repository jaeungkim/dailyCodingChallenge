public class jaeSolution {
    /*
    Input: haystack = "hello", needle = "ll"
    Output: 2
    return index
    
    Store needle value in array ex) [l,l]
    and if these occur in haystack return it's index otherwise return 0 or -1
    */
    
    // empty needle appears everywhere, first appears at 0 index
    if (needle.length() == 0)
    return 0;
   
   
   for (int i = 0; i < haystack.length(); i++) {
       // no enough places for needle after i
       if (i + needle.length() > haystack.length()) break;
       
       for (int j = 0; j < needle.length(); j++) {
           if (haystack.charAt(i+j) != needle.charAt(j))
               break;
           if (j == needle.length()-1)
               return i;
       }
   }
   
   return -1;
}
