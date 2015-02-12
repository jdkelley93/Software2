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
   
    static int count,times;
    int left;
     ArrayList <Object> messages= new ArrayList<>(times+1);
    boolean changed=false;
    String message="";
    
   
   
   public Subject(){
    
    
    }
    
     public Subject(int times){
    this.times=times;
    
    }

    
    public void add(Observer o){
        addObserver(o);
    }
    public void delete(Observer o){
        deleteObserver(o);
    }
    public void alert()
    {
        if (changed==true){
         setChanged();
          notifyObservers(messages);
          messages.clear();
             //count=0;
         changed=false;
    }
        else if(changed==false)
        {
            flag();
        }
        else{
         System.out.print("Error.. Exiting");
         System.exit(0);
        }
    }
     protected void flag()
     {
        if(count%times==0)
        {
         changed=true;
         alert();
        }
        else{
            changed=false;
         alert();
      }  
    }
      public void setmessage(String message)
      {
        count++;
        left=times-count;
        this.message=message;
         messages.add(message);
        if(count<times){
        System.out.println("Not time to alert yet! " +left+" more messages have to be sent before the observers will be able to view content" );
          
         }
         if(count==times)
         {
            alert();
         }

      
         if(count>times)
         {
            count=0;
            setmessage(message);
         }
         
       
     }
      public String getmessage(){
        return message;
        
        
    }
}