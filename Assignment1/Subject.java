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
    int count,times=0;
    boolean changed=false;
    String message;
    
    public Subject(int times){
    times=this.times;
    }

    
    public void add(Observer o){
        a.addObserver(o);
    }
    public void delete(Observer o){
        a.deleteObserver(o);
    }
    public void alert(){
        if (changed==true){
        a.notifyObservers();
         System.out.print("All observers have been notified!");
         count=0;
         messages.clear();
    }
        else
            System.out.print("Not time to alert yet!");
            messages.add(message);
            flag();
    }
     protected void flag(){
        count++;
        if(count>=times)
         changed=true;
         else 
            changed=false;
        
    }
      public void setmessage(String message){
        message=this.message;
    messages.add(message);
     }
    
}