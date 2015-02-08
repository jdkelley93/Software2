
import java.util.*;
import java.math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Calc {
    ArrayList<Double> orders = new ArrayList<Double>();
    double min = 0.0;
    double max = 0.0;
    double std = 0.0;
    double avg = 0.0;
    double total = 0.0;
    int count = 0;
    
    Calc(ArrayList<Double> orders){
        this.orders = orders;  
        count =  orders.size();
        
    }
    
    public double getTotal(){
        for(int i = 0; i < orders.size(); i++){
            //System.out.println(orders.get(i));
            total += orders.get(i);
        }
        
        return total;
    }

    public double getAvg(){
        double t = getTotal();
        avg = t/count;
        return avg;
    }
    public double getMin(){
        Collections.sort(orders);
        return orders.get(0);
    }
    
    public double getMax(){
        Collections.sort(orders);
        
        return orders.get(orders.size()-1);
    }
    
    public double getStd(){
        
        double sum = 0.0;
        double mean = getAvg();
        
        for (int i = 0; i < orders.size(); i++) {
            sum += Math.pow((i-mean), 2);
        }
        
        return Math.sqrt(sum/(orders.size()-1));
    }
    
    public double getMed(){
        int middle = orders.size()/2;
        
        if(orders.size() % 2 ==1){
            return orders.get(middle);
        }
        else{
            return (orders.get(middle-1) + orders.get(middle))/2;
        }
    }
}
