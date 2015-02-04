/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Dunn
 */
import java.util.Observable;
import java.util.Observer;
public interface Observing extends Observer  {
    
    public void update(Observable o, Object arg);
}
