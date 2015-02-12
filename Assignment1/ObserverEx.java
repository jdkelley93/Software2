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
                Subject sbj = new Subject(2);
                sbj.add(new Concreteobserver());
                
                 sbj.setmessage("The weather for today is Cold");
                 sbj.setmessage("The weather for today is Hot");
                 sbj.setmessage("The weather for today is Windy");
                 sbj.setmessage("The weather for today is Cloudy");
                 sbj.setmessage("The weather for today is Rainy");
                  sbj.setmessage("The weather for today is Gloomy");
                
                 
                
        }
    
}
