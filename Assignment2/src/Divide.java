/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Kelley
 */
public class Divide extends OperationDecorator {

    @Override
    public double calculate(double a, double b) {
        return a/b;
        
    }
}
