
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Dunn
 */
public class Concreteobserver implements Observing{
    
        String message="";
        
        public Concreteobserver()
        {
            
        }
        
        public void update(Observable a, Object b)
        {
            String messages=" ";
           
            System.out.println("Messages received: "+b);
            
         
           Subject sub = (Subject)a;
            String messagepulled= sub.getmessage();
           System.out.println("\n\n\nThe last message pulled from the subject is :"+messagepulled+"\n\n\n\n");
            
            
            
            
        }    
    
}
