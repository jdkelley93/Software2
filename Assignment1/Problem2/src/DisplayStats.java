import java.text.*;
import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author David
 */
public class DisplayStats {
    
    Calc c;
    String location;
    ArrayList<String> files = new ArrayList<String>();
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
        
        
        writer.println("\t\tWeekly Order Statistics for " + location);
        writer.println("\nTotal Price For Orders: $" + df.format(total));
        writer.println("Average: $" + df.format(avg));
        writer.println("Max: $" + df.format(max));
        writer.println("Min: $" + df.format(min));
        writer.println("Median: $" + df.format(med));
        writer.println("Standard Deviation: $" + df.format(std));
        writer.close();
        
        //System.out.println("done writing file");
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

        files.add(filename);
        
        
    }

    void destroySession(ArrayList<String> locs){
        for(int i = 0; i < locs.size(); i++){
            files.add(locs.get(i)+"s.txt");
        }
        for(int i = 0; i < files.size(); i++){
            File toDelete = new File(files.get(i));            
                toDelete.delete();
        }
    }
    
}
