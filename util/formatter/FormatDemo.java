/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.formatter;

/**
 *
 * @author matenadaran
 */
// A very simple example that uses Formatter.
import java.util.*;
class FormatDemo {
public static void main(String args[]) {
Formatter fmt = new Formatter();
fmt.format("Formatting %s %s is easy %d %f", "with Java", "with Java1", 10, 98.6);
System.out.println(fmt);
fmt.close();
}
}
