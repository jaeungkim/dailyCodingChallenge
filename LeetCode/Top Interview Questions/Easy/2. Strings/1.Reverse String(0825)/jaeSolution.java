public class jaeSolution {
    // Write a function that reverses a string. The input string is given as an
    // array of characters s.
    // Input: s = ["h","e","l","l","o"]
    // Output: ["o","l","l","e","h"]

    //reverse string
    if (s == null){
        return;
    }
    
    int i = 0;
    int j = s.length -1; //4
    char tmp;
        
    //s = {h,e,l,l,o}
    while (j > i){ // 4>0, 3>1, 
        tmp = s[j]; //tmp = s[4] = o
        s[j] = s[i]; //s[4] = s[0]   s[4] = h
        s[i] = tmp; //s[o] = tmp = o 
        j--;
        i++;
    }
}
