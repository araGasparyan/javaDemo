/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.scanner;

/**
 *
 * @author matenadaran
 */
// Demonstrate findInLine().
import java.util.*;
class FindInLineDemo {
public static void main(String args[]) {
String instr = "Name: Tom Age: 28 ID: 77";
Scanner conin = new Scanner(instr);
// Find and display age.
conin.findInLine("Age:"); // find Age
if(conin.hasNext())
System.out.println(conin.next());
else
System.out.println("Error!");
conin.close();
}
}