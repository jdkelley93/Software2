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
        
        System.out.println("What is the name of the file?: ");
        filename = scan.next();
        File file = new File(filename);
        if(! file.exists()){
            System.out.println("File Does Not Exist! Exiting..");
            System.exit(0);
            
        }
        //System.out.println("out");
        scan.close();
        File file2 = new File(filename);
        Scanner fileScan = new Scanner(file2);
        ArrayList<String> locations = new ArrayList<String>();
        ArrayList<String> formats = new ArrayList<String>();
        ArrayList<String> fileNames = new ArrayList<String>();
        
        String loc;
        String format;
        String fn;
        String token;
        int count = 0;
        
        while(fileScan.hasNext()){
            token = fileScan.next();
            //System.out.println(token);
            if(count == 0){
                //System.out.println("0");
                locations.add(token);
                count = 1;
            }
            if(count == 1){
                
                formats.add(token);
                count = 2;
            }
            else{
                
                fileNames.add(token);
                count = 0;
            }
        }
        //System.out.println("going to for");
        for(int i = 0; i < formats.size()-1; i++){
            if(formats.get(i).equals("1")){
                //System.out.println("going to p1");
                Parser p = new Format1_Parser(fileNames.get(i), locations.get(i));
            }
            else{
                //System.out.println("going to p2");
                Parser p = new Format2_Parser(fileNames.get(i), locations.get(i));
            }
        }
        
        String city = "Valdosta";
        
        DisplayStats ds = new DisplayStats(city);
        
        ds.getStats(city);
        
        
        
        /*format = scan.next();
        while(flag == 0){
            if(format.equals("1")){
                //System.out.println("format 1");
                flag = 1;
                Parser p = new Format1_Parser(filename);
                p.parse();
            }
            else if(format.equals("2")){
                //System.out.println("format 2");
                flag = 1;
                Parser p = new Format2_Parser(filename);
                p.parse();
            }
            else{
                System.out.println("You must enter a 1 or 2");
                format = scan.next();
            }
        }*/
    }
    
}
