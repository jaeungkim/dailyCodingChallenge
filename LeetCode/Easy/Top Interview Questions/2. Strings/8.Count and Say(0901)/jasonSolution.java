class Solution {
    public String countAndSay(int n) {
        String[] fib = new String[n];
        fib[0] = "1";
        for(int i = 1; i < n; i++){
            if(fib[i] == null){
                fib[i] = say(fib[i-1]);
            }
        }
        return fib[n-1];
    }
    
    public String say(String nums){
        char prev = nums.charAt(0);
        int len = 1;
        StringBuilder sb= new StringBuilder();
        for(int i = 1; i < nums.length(); i++){
            char curr = nums.charAt(i);
            if(prev != curr){
                sb.append(len+""+prev);
                len = 1;
                prev = curr;
            }
            else {
                len++;
            }        
        }
        sb.append(len+""+prev);
        
        return sb.toString();
    }
}
