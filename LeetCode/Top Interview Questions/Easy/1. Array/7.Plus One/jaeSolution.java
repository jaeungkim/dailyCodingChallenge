public class jaeSolution {
    // You are given a large integer represented as an integer array digits, where
    // each digits[i] is the ith digit of the integer. The digits are ordered from
    // most significant to least significant in left-to-right order. The large
    // integer does not contain any leading 0's.

    // Increment the large integer by one and return the resulting array of digits.

    // ex)

    // Input: digits = [1,2,3]
    // Output: [1,2,4]
    // Explanation: The array represents the integer 123.
    // Incrementing by one gives 123 + 1 = 124.
    // Thus, the result should be [1,2,4].

    int n = digits.length;
    //{9,9,9}
    //move along the input array starting from the end
    for (int idx = n-1; idx >=0; --idx){
        //set all the nines at the end of array to zeroes
        if (digits[idx] == 9){
            digits[idx] = 0;
        } else {
            digits[idx]++;
            return digits;
        }
    }
    
    digits = new int[n+1];
    digits[0] = 1;
    return digits;
}
