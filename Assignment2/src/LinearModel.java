
import java.util.ArrayList;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Kelley
 */
public class LinearModel  extends SimpleModelFactory   {

    @Override
    public ArrayList<Double> evaluate(String func, ArrayList<Double> xValues) {
        ArrayList<Double> yValues = new ArrayList<Double>();
        Stack<Character> ops = new Stack<Character>();
        Stack<Double> nums = new Stack<Double>();
        
        Add add = new Add();
        Subtract sub = new Subtract();
        Multiply mult = new Multiply();
        Divide div = new Divide();
        int count = 0;
        for(int i  = 0; i < xValues.size(); i++){
            while(!ops.empty()){
                    ops.pop();
            }
            while(!nums.empty()){
                nums.pop();
            }
            for(int j = 0; j < func.length(); j++){
                
                
                char c = func.charAt(j);
                
                if(Character.isDigit(c)){
                    //System.out.println(c + " is digit");
                    if(j+1 < func.length()){
                        char t = func.charAt(j+1);
                        if(t == 'x'){
                           // System.out.println("there was an x");
                            double d = (double)(c-'0');
                            double dd = mult.calculate(xValues.get(i), d);
                            nums.push(dd);
                           // System.out.println("pushed: " + dd);
                            count++;
                            j++;
                        }
                        else{
                            double p = ((double)(c-'0'));
                            nums.push(p);
                            //System.out.println("pushed: " + p);
                            count++;
                        }
                        
                    }
                    else{
                            double p = ((double)(c-'0'));
                            nums.push(p);
                            //System.out.println("pushed: " + p);
                            count++;
                        }
                    
                }
                else{
                    //System.out.println(c + " is op");
                    ops.push(c);
                    //System.out.println("pushed to op: " + c);
                }
                
                
                if(count == 2){
                    double a = nums.pop();
                    //System.out.println("popped: " + a);
                    double b = nums.pop();
                    //System.out.println("popped: " + b);
                    char o = ops.pop();
                    double x;
                            
                    if(o == '+'){
                         x = add.calculate(a,b);
                    }
                    else{
                        x = sub.calculate(b, a);
                    }
                        
                    nums.push(x);
                    //System.out.println("pushed: " + x);
                    count = 1;
                }
                
            }
            yValues.add(nums.pop());
            count = 0;
        }
        
        
        return yValues;
        
        
    }
    
}
