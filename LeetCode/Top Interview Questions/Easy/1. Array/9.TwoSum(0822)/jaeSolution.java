public class jaeSolution {
    //pretty straight forward answer won't add descriptions
    
    int[] temp = new int[2];
        
    for (int i = 0 ; i < nums.length; i++){
        for (int j = i+1; j < nums.length; j++){
            if(target-nums[i] == nums[j]){
                temp[0] = i;
                temp[1] = j;
            }
        }
    }
    return temp;
}
