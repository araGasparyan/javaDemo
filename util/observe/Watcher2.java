/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.observe;

// This is the second observing class.

import java.util.Observable;
import java.util.Observer;

class Watcher2 implements Observer {
public void update(Observable obj, Object arg) {
// Ring bell when done
if(((Integer)arg).intValue() == 0)
System.out.println("Done" + '\7');
}
}