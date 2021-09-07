public class jaeSolution {
    //given an array, rotate the array to the right by k steps, where k is non-negative
    //ex) nums = [1,2,3,4,5,6,7], k =3 -> [5,6,7,1,2,3,4]

    int n = nums.length; //7
    int[] result = new int[n]; //new result array with nums length
    for(int i=0; i<k; i++){ //0,1,2 (3 times)
        result[i] = nums[n-k]; //rotate array for n-k amount (n-k=4, result[i] = 5) 
    }
    //result[0] = 5, result[1] = 6, result[2]= 7
    int j=0;

    for(int i=k; i<n; i++){ //3, 3<7 3++, (3,4,5,6) 4 times 
        result[i] = nums[j]; //result[3] = nums[0] = 1 --> yaddi yadda
        j++; //1,2,3,4
    }

    //print result => answer
}
