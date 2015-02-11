/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Dunn
 */
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable{
    ArrayList <Object> messages= new ArrayList<>(100);
    Observable a = new Observable();
    int count,times;
    boolean changed=false;
    String message;
    
    public Subject(int times){
    this.times=times;
    }

    
    public void add(Observer o){
        a.addObserver(o);
    }
    public void delete(Observer o){
        a.deleteObserver(o);
    }
    public void alert(){
        if (changed==true){
         setChanged();
            for(Object message : messages)
            {
                a.notifyObservers((String)message);
                //System.out.print("Notified called");
            }
         System.out.print("All observers have been notified!");
         count=0;
         messages.clear();
         changed=false;
    }
        else if(changed==false)
        {
           
            System.out.println("Not time to alert yet!");
            messages.add(message);
            flag();
            
        }
        else
         System.out.print("Error.. Exiting");
         System.exit(0);
    }
     protected void flag(){
        count++;
        if(count==times)
        {
         changed=true;
         alert();
        }
         else 
            changed=false;
       alert();
        
    }
      public void setmessage(String message){
        this.message=message;
         //messages.add(message);
     }
    
}