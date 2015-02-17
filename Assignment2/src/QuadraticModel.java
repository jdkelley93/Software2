
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Kelley
 */
public class QuadraticModel extends SimpleModelFactory {

    /**
     *
     * @param func
     * @param xValues
     * @return
     */
    @Override
    public ArrayList<Double> evaluate(String func, ArrayList<Double> xValues) {
        
        ArrayList<Double> yValues = new ArrayList<Double>();
        String newFunc = func;
        Stack ops = new Stack();
        Stack<Double> nums = new Stack<Double>();
        
        Add add = new Add();
        Subtract sub = new Subtract();
        Multiply mult = new Multiply();
        Divide div = new Divide();
        
        int exFlag = 0;
        
        for (int i = 0; i < xValues.size(); i++){
            while(!ops.isEmpty()){
                ops.pop();
            }
            while(!nums.isEmpty()){
                nums.pop();
            }
            
            newFunc = func.replaceAll("x", xValues.get(i).toString());
            for(int j = 0; j < func.length(); j++){
                char c = func.charAt(j);
                
                if(c == ('x')){
                    double temp = nums.pop();
                    double m = xValues.get(i);
                    double toPush = mult.calculate(temp, m);
                    nums.push(toPush);
                    
                }
                else if(c == '^'){
                    
                }
                
            }
        }
        
        
        
        return null;
    }
}
