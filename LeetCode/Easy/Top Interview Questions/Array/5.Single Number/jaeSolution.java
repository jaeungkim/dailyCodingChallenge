public class jaeSolution {
    //given a non-empty array of integers nums, every element appears twice excpet for one, find that one
    //ex) input nums = [2,2,1] output 1
    //ex) input nums = [4,1,2,1,2] ouptut 4
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>(); //arraylist to add and remove from array nums
    
        for (int i : nums) { //for int i in nums array
          if (!list.contains(i)) { //if there's no int i in list   
            list.add(i); // add i to list ex) [4,1,2,1,2] -> <4,1,2> 
          } else { // elses
            list.remove(new Integer(i)); //if it contains it remove it <4,1,2> -> <4>
          }
        }
        return list.get(0); //<4> = 4
      }
}
