/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.observe;

import java.util.*;
// This is the first observing class.
class Watcher1 implements Observer {
@Override
public void update(Observable obj, Object arg) {
System.out.println("update() called, count is " +
((Integer)arg).intValue());
}}
