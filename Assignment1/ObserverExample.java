/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Dunn
 */
import java.util.*;

public class ObserverExample
{
   public static void main( String[] args ) 
   {
      WeatherStation weatherStation = new WeatherStation();  // Create Observable
      
      weatherStation.addObserver( new TiftonTV() );  // Create Observers and add
      weatherStation.addObserver( new ValdostaTV() );
     //System.out.println("added observers");
      weatherStation.setTempAndHumidity(99, 0.3);  // Sample call to change the Observable
      // System.out.println("temp set");
   }
}

class WeatherStation extends Observable
{
   private double temp;
   private double humidity;
   
   public void setTempAndHumidity( double temp, double humidity )
   {
      temp= this.temp;
      humidity=this.humidity;
      // Java requires this statement before notify will work.
      // In your problem you want to notify after "n" news posts
      // have been set.
      setChanged();  
      // Push temperature
      notifyObservers(temp);
       //System.out.println("notified");
   }
   
   // Used by observers to Pull the humidity.
   public double getHumidity()
   {
      return humidity;
   }
}

class ValdostaTV implements Observer
{
   public void update( Observable observable, Object arg )
   {
      // Retrieve "pushed" temperature;
      double temp = (double)arg;
      System.out.println( "ValdostaTV brings you the temp: " + temp );

      // Next, we "Pull" humidity. First, we need a reference to the
      // Weather Station. We must cast the "observable" that was 
      // passed in update method so we can access the getHumidity method.
      WeatherStation weatherStation = (WeatherStation)observable;
      double humidity = weatherStation.getHumidity();
      System.out.println( "ValdostaTV pulled the humidity: " + humidity );
      System.out.println();
   }
}

class TiftonTV implements Observer
{
   public void update( Observable observable, Object arg )
   {
      // Retrieve "pushed" temperature;
      double temp = (double)arg;
      // Convert to celsius
      temp = (temp-32)*5.0/9.0;
      System.out.println( "TiftonTV brings you the celsius temp: " + temp );
      System.out.println();
   }
}
