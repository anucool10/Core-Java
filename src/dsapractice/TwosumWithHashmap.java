package dsapractice;
import java.util.HashMap;

public class TwosumWithHashmap {

    public static int[] twoSum(int[] nums, int target) {
   
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

          
            int complement = target - currentNum;

            if (seen.containsKey(complement)) {
                
            	
                return new int[] { seen.get(complement), i };
            }
          
            seen.put(currentNum, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + " and " + result[1]);
    }
}