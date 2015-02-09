import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.*;
/**
 *
 * @author David
 */
public class Format1_Parser extends Parser{

    public Format1_Parser(String filename, String location) {
        super(filename,location);
    }

    @Override
    void parse() { 
        //System.out.println(filename);
        File file = new File(filename);
        String x = "";
        String y = "#";
        double item = 0.0;
        double total = 0.0;
        double totalOrder = 0.0;
        
        ArrayList<Double> orders = new ArrayList<Double>();
        
        try {
            Scanner scan = new Scanner(file);
            
            while(scan.hasNext()){
                x = scan.next();
                //System.out.println(x);
                if(x.equals(y)){
                    //System.out.println(x);
                    //System.out.println(totalOrder);
                    total += totalOrder;
                    orders.add(totalOrder);
                    totalOrder = 0.0;
                    //System.out.println(total);
                    
                }
                else{
                    //System.out.println(x);
                    item = Double.parseDouble(x);
                    //System.out.println(item);
                    totalOrder += item;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Format1_Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        Calc c = new Calc(orders);
        DisplayStats ds = new DisplayStats(c, location);
        try {
            ds.display();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Format1_Parser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Format1_Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
}
