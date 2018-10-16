import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class RandomTeam {
    
    
    private void randomizeTeam(Map<Integer, Integer> team) {
        if (null == team || team.isEmpty()) {
            System.out.println("Empty team values");
        }
        for (Integer key : team.keySet()) {

        }
        
    }
    
    public static void main(String [] argv) {
        System.out.println(RandomTeam.class);
        Map<Integer, Integer> teamMap = new HashMap<>();
        Integer size = 10;
        Random rand = new Random();
        for (int player =0; player < (2*size); player++) {
            // randomize player score            
            Integer score = rand.nextInt(50);
            teamMap.put(player, score);
        }
        RandomTeam team = new RandomTeam();
        team.randomizeTeam(teamMap);
        
    }
}

// O(n logn)
