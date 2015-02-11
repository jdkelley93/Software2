import java.util.*;
import java.io.*;
/**
 *
 * @author David
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       
        String filename = "";
        int flag = 0;
        int exist = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the name of the file containing location information?: ");
        filename = scan.next();
        File file = new File(filename);
        if(! file.exists()){
            System.out.println("File Does Not Exist! Exiting..");
            System.exit(0);
            
        }
        //System.out.println("out");
        //scan.close();
        File file2 = new File(filename);
        Scanner fileScan = new Scanner(file2);
        ArrayList<String> locations = new ArrayList<String>();
        ArrayList<String> formats = new ArrayList<String>();
        ArrayList<String> fileNames = new ArrayList<String>();
        
        String loc;
        String format;
        String fn;
        String token;
        String ext = ".txt";
        
        while(fileScan.hasNext()){
            token = fileScan.next();
            //System.out.println(token);
            if(isInteger(token) == true){
                formats.add(token);
            }
            else if(token.contains(ext)){
                fileNames.add(token);
            }
            else{
                locations.add(token);
            }
        }
        fileScan.close();
        //System.out.println("going to for");
        for(int i = 0; i < formats.size(); i++){
            if(formats.get(i).equals("1")){
                //System.out.println("going to p1");
                Parser p = new Format1_Parser(fileNames.get(i), locations.get(i));
                p.parse();
            }
            else{
                //System.out.println("going to p2");
                Parser p = new Format2_Parser(fileNames.get(i), locations.get(i));
                p.parse();
            }
        }
        
        System.out.println("\n");

        
        String city;
        String go = "yes";
        int ok = 0;
        DisplayStats ds = null;        
        
        
        while(go.equals("yes")){
            System.out.println("\tCities currently in the system:");
            for(int i = 0; i < locations.size(); i++){
                    System.out.println(locations.get(i));
            }

            System.out.println("\nWhich city listed above would you like to see stats for?");
            city = scan.next();

            if(locations.contains(city)){
                ok = 1;
                ds = new DisplayStats(city);
                ds.getStats(city);
                System.out.println("\nWould you like to see stats for another city?(yes/no)");
                go = scan.next();
            }
            else{
                System.out.println("\nThat is not one of the cities in the system. Would you like to try again?(yes/no)");
                go = scan.next();
            }
        }    
    
        ds.destroySession(locations);
        
    }

    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        // only got here if we didn't return false
        return true;
    }
    
}
