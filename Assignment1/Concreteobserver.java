
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
            String messagegot = (String)b;
            message=messagegot;
            System.out.print("The message sent out to all observers is: "+messagegot);
            
            /*ConcreteSubject sub = new ConcreteSubject(10);
           String messagepulled= sub.getmessage();
           System.out.print("The message pulled from concrete subject is "+messagepulled);*/
            
            
            
        }    
    
}
