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
    String location;
    
    Parser(String filename, String location){
        this.filename = filename;
        this.location = location;
    }
    
    abstract void parse();
    
}
