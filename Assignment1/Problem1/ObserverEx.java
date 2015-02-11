/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Dunn
 */
public class ObserverEx {
        public static void main(String[]args)
        {
                Subject sbj = new Subject(3);
                sbj.add(new Concreteobserver());
                
                 sbj.setmessage("The weather for today is Cold");
                 sbj.alert();
                 
                
        }
    
}
