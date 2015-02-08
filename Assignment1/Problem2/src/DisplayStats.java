import java.text.*;
/**
 *
 * @author David
 */
public class DisplayStats {
    
    Calc c;
    
    DisplayStats(Calc c){
        this.c = c;
    }
    
    void display(){
        double total = c.getTotal();
        double avg = c.getAvg();
        double max = c.getMax();
        double min = c.getMin();
        double med = c.getMed();
        double std = c.getStd();
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("\t\tWeekly Order Statistics");
        System.out.println("\nTotal Price For Orders: $" + df.format(total));
        System.out.println("Average: $" + df.format(avg));
        System.out.println("Max: $" + df.format(max));
        System.out.println("Min: $" + df.format(min));
        System.out.println("Median: $" + df.format(med));
        System.out.println("Standard Deviation: $" + df.format(std));
    }
}
