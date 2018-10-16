package org.wss.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MinMaxPairs {
    
    private void generateAllPairs(List<Integer> nums) {
        int size = nums.size() / 2;
        
        for (Integer num : nums) {
        }
    }
 
    public static void main(String [] argv) {
        MinMaxPairs pairs = new MinMaxPairs();
        List<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(3); nums.add(5); nums.add(9);
        pairs.generateAllPairs(nums);
    }
}



/* 
1 3 5 9 : 
1,3 5,9 
1,5 3,9 
1,9 3,5

// 
1 2 3 5 7 9:

1,2,3 5,7,9 
    
2,3,5 1,7,9
1,3,5 2,7,9
1,2,5 3,7,9
    
2,3,7 1,5,9 
1,3,7 2,5,9
1,2,7 3,5,9
    
2,3,9 3,5,7 
1,3,9 2,5,7
1,2,9 3,5,7
   
1 2 3 4 5 6 7 8:

1 2 3 4 5 6 7 8

1 2 3 4 5 6 7 8
*/
