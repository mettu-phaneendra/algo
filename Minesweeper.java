import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Minesweeper {
    private int rows, cols;
    private String [][] matrix;
    private List<Map<Integer, Integer>> neighbours;
    
    public void init () {
        neighbours = new ArrayList<>();
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>(){{put(-1, 0);}}; 
        neighbours.add(temp);
        temp = new HashMap<Integer, Integer>(){{put(-1,-1);}};
        neighbours.add(temp); 
        temp = new HashMap<Integer, Integer>(){{put(0,1);}};
        neighbours.add(temp);
        temp = new HashMap<Integer, Integer>(){{put(-1,1);}};
        neighbours.add(temp);
        temp = new HashMap<Integer, Integer>(){{put(0,-1);}};
        neighbours.add(temp);
        temp = new HashMap<Integer, Integer>(){{put(1,1);}};
        neighbours.add(temp);
        temp = new HashMap<Integer, Integer>(){{put(1,0);}};
        neighbours.add(temp);
        temp = new HashMap<Integer, Integer>(){{put(1,-1);}};
        neighbours.add(temp);
    }
    
    private void buildTheMatrix() {
        init();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String element = matrix[i][j];
                if (element.equals("*") ) {
                    incrementSurroundingSquares(i, j);
                }
            }
        }
    }
    
    private void incrementSurroundingSquares(int row, int col) {
        System.out.println("increment surrounding squares for row :" + row + " and column :" +col);
        System.out.println("Size :" +neighbours.size());
        for (Map<Integer, Integer> rowN : neighbours) {
            Map.Entry<Integer, Integer> colS = rowN.entrySet().iterator().next();
            System.out.println("row :" + (row-colS.getKey()) + " column :"+ (col-colS.getValue()));
        }
    }
    
    public static void main(String [] argv) {
        Minesweeper ms = new Minesweeper();
        ms.rows = 4; ms.cols = 4;
        String [][] matrix = new String [ms.rows][ms.cols];
        matrix[0][0] = "*";matrix[0][1] = ".";matrix[0][2] = ".";matrix[0][3] = ".";
        matrix[1][0] = ".";matrix[1][1] = ".";matrix[1][2] = ".";matrix[1][3] = ".";
        matrix[2][0] = ".";matrix[2][1] = "*";matrix[2][2] = ".";matrix[2][3] = ".";
        matrix[3][0] = ".";matrix[3][1] = ".";matrix[3][2] = ".";matrix[3][3] = ".";
        
        ms.matrix = matrix;
        ms.buildTheMatrix();
    }
}

