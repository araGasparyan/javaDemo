/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.timer;

import java.util.TimerTask;

/**
 *
 * @author matenadaran
 */
class MyTimerTask extends TimerTask {
@Override
public void run() {
System.out.println("Timer task executed.");
}
}
