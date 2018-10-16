
public class Sqrt {

    private Float calculateRoot(Float seed) {
        float noRoot = -1;
        float iter = seed;
        float precesion = (float) 1.001;
        int count = 0;
        while(iter > 0) {
            count++;
            float sum = (iter/2);
            float prod = sum * sum;
            if (prod > seed) {
                iter = sum;
            }
            if (prod < seed) {
                iter = iter+1;
            }
            if (prod == seed) {
                System.out.println(count);
                return sum;
            }
        }
        System.out.println(count);
        return noRoot;
    }
    
    public static void main(String[] argv) {
        Sqrt root = new Sqrt();
        System.out.println(root.calculateRoot((float)35621*35621));
    }
    
}
