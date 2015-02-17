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
        SimpleModelFactory qm = new QuadraticModel();
        ArrayList<Double> xValues = new ArrayList<Double>();
        ArrayList<Double> yValues;
        ArrayList<Double> yValues2;
        String func = "5x+6-7x";
        String func2 = "5x^2+6x-7";
        
        xValues.add(1.0);
        xValues.add(2.0);
        xValues.add(3.0);
        xValues.add(4.0);
        xValues.add(5.0);
        
        yValues = lm.evaluate(func, xValues);
        yValues2 = qm.evaluate(func2, xValues);
        
        
        
        for(int i = 0; i < yValues.size(); i++){
            System.out.print(func + " evaluated at " + xValues.get(i) + " = ");
            System.out.print(yValues.get(i) + "\n");
        }
        System.out.println("\n");
        for(int j = 0; j < yValues.size(); j++){
            System.out.print(func2 + " evaluated at " + xValues.get(j) + " = ");
            System.out.print(yValues2.get(j) + "\n");
        }
        
        
        
    }
    
}
