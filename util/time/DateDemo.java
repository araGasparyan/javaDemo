/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.time;

/**
 *
 * @author matenadaran
 */
// Show date and time using only Date methods.
import java.util.Date;
class DateDemo {
public static void main(String args[]) {
// Instantiate a Date object
Date date = new Date();
// display time and date using toString()
System.out.println(date);
// Display number of milliseconds since midnight, January 1, 1970 GMT
long msec = date.getTime();
System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
}
}
