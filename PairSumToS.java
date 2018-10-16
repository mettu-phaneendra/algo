import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class PairSumToS {
    
    private Map<Integer, Integer> findPairs(List<Integer> nums, Integer target) {
        Map<Integer, Integer> response = new HashMap<>();
        if (null == nums || nums.isEmpty()) {
            return response;
        }

        for (Integer num : nums) {
            int key1 = target - num;
            if (nums.contains(key1)) {
                response.put (key1, num);
            }
        }
        return response;
    }
    
    private static void printPairs(int target) {
        PairSumToS pairs = new PairSumToS();
        List<Integer> nums = Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12); 

        Map<Integer, Integer> response = pairs.findPairs(nums, target);
        System.out.println("Target :" +target + " Size :" + response.size());
        //System.out.print("Pairs :");
        /*for (Integer key : response.keySet()) {
            System.out.print("(" + key +", " +response.get(key) +") ");
        }*/
        //System.out.println();
    }
    
    public static void main(String [] argv) {
        for (int i = -8; i < 13; i++) {
            printPairs(i);    
        }
      }
}

