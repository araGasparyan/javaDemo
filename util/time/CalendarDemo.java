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
// Demonstrate Calendar
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
class CalendarDemo {
public static void main(String args[]) {
String months[] = {
"Jan", "Feb", "Mar", "Apr",
"May", "Jun", "Jul", "Aug",
"Sep", "Oct", "Nov", "Dec"};
// Create a calendar initialized with the
// current date and time in the default
// locale and timezone.
Calendar calendar = Calendar.getInstance();
// Display current time and date information.
System.out.print("Date: ");
System.out.print(months[calendar.get(Calendar.MONTH)]);
System.out.print(" " + calendar.get(Calendar.DATE) + " ");
System.out.println(calendar.get(Calendar.YEAR));
System.out.print("Time: ");
System.out.print(calendar.get(Calendar.HOUR) + ":");
System.out.print(calendar.get(Calendar.MINUTE) + ":");
System.out.println(calendar.get(Calendar.SECOND));
// Set the time and date information and display it.
calendar.set(Calendar.HOUR, 10);
calendar.set(Calendar.MINUTE, 29);
calendar.set(Calendar.SECOND, 22);
System.out.print("Updated time: ");
System.out.print(calendar.get(Calendar.HOUR) + ":");
System.out.print(calendar.get(Calendar.MINUTE) + ":");
System.out.println(calendar.get(Calendar.SECOND));
Set<?> set = Calendar.getAvailableCalendarTypes();
    System.out.println(set);
    Locale loc [] = Calendar.getAvailableLocales();
    System.out.println(new ArrayList<Locale>(Arrays.asList(loc)));
}
}