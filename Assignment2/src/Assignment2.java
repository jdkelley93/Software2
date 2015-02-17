import java.util.*;


/**
 *
 * @author David Kelley
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleModelFactory lm = new LinearModel();
        ArrayList<Double> xValues = new ArrayList<Double>();
        ArrayList<Double> yValues;
        String func = "5x+6-7x";
        
        xValues.add(1.0);
        xValues.add(2.0);
        xValues.add(3.0);
        xValues.add(4.0);
        xValues.add(5.0);
        
        yValues = lm.evaluate(func, xValues);
        
        
        
        for(int i = 0; i < yValues.size(); i++){
            System.out.print(func + " evaluated at " + xValues.get(i) + " = ");
            System.out.print(yValues.get(i) + "\n");
        }
        
        
        
    }
    
}
