import java.text.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author David
 */
public class DisplayStats {
    
    Calc c;
    String location;
    DisplayStats(String location){
        this.location = location;
    }
    
    DisplayStats(Calc c,String location){
        this.c = c;
        this.location = location;
    }
    
    
    void display() throws FileNotFoundException, UnsupportedEncodingException{
        double total = c.getTotal();
        double avg = c.getAvg();
        double max = c.getMax();
        double min = c.getMin();
        double med = c.getMed();
        double std = c.getStd();
        DecimalFormat df = new DecimalFormat("##.00");
        
        String filename = location+"s.txt";
        
        PrintWriter writer = new PrintWriter(filename,"UTF-8");
        
        
        writer.println("\t\tWeekly Order Statistics");
        writer.println("\nTotal Price For Orders: $" + df.format(total));
        writer.println("Average: $" + df.format(avg));
        writer.println("Max: $" + df.format(max));
        writer.println("Min: $" + df.format(min));
        writer.println("Median: $" + df.format(med));
        writer.println("Standard Deviation: $" + df.format(std));
        writer.close();
        
        System.out.println("done writing file");
    }
    
    void getStats(String location) throws FileNotFoundException, IOException{
        String filename = location+"s.txt";
        
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        
        String line = null;
        
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        
        br.close();
        
        
        
    }
    
}
