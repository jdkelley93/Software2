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
        SimpleModelFactory qm = new QuadraticModel();
        ArrayList<Double> xValues = new ArrayList<Double>();
        ArrayList<Double> yValues;
        String func = "5x*2+4x+3";
        
        xValues.add(1.0);
        xValues.add(2.0);
        xValues.add(3.0);
        xValues.add(4.0);
        xValues.add(5.0);
        
        yValues = qm.evaluate(func, xValues);
        
        
        
    }
    
}
