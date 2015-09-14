/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.observe;

/**
 *
 * @author matenadaran
 */
/* Demonstrate the Observable class and the
Observer interface.
*/
import java.util.*;
// This is the observing class.
class Watcher implements Observer {
@Override
public void update(Observable obj, Object arg1) {
System.out.println("update() called, count is " +
((Integer)arg1).intValue());
}
}
