import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class Format2_Parser extends Parser {

    public Format2_Parser(String filename) {
        super(filename);
    }

    @Override
    void parse() {
        File file = new File(filename);
        Scanner scan;
        ArrayList<Double> orders = new ArrayList<Double>();
        double d = 0.0;
        try {
            scan = new Scanner(file);
            
            while(scan.hasNext()){
                d = scan.nextDouble();
                orders.add(d);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Format2_Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       Calc c = new Calc(orders);
        DisplayStats ds = new DisplayStats(c);
        ds.display();
        
    }
    
}
