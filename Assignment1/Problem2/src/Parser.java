/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public abstract class Parser {
    String filename;
    
    Parser(String filename){
        this.filename = filename;
    }
    
    abstract void parse();
    
}
