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
    public static void main(String[] args) {
        // TODO code application logic here
        String format = "";
        String filename = "";
        int flag = 0;
        int exist = 0;
        Scanner scan = new Scanner(System.in);
        
        
        while(exist == 0){
            System.out.println("What is the name of the file?: ");
            filename = scan.next();
            File file = new File(filename);
            if(file.exists()){
                exist = 1;
            }
            else{
                System.out.println("File Does Not Exist. Please enter another filename: ");
                filename = scan.next();
            }
        }
        
        
        
        
        System.out.println("What format is your file in?(1/2)");
        format = scan.next();
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
        }
    }
    
}
