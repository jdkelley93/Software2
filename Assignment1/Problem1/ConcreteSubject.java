/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Dunn
 */
public class ConcreteSubject extends 
        Subject{
static String message ="";
    public ConcreteSubject(int times) {
        super(times);
    }
    
    @Override
    public void alert(){
        
    }
    public String getmessage(){
        return message;
        
        
    }
    
     public void setmessage(String message){
        message=this.message;
    messages.add(message);
     }
    
    
}
