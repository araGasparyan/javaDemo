/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.time;
import java.util.*;
/**
 *
 * @author matenadaran
 */
public class TimeZoneDemo {
    public static void main(String[] args) {
       
        String zones []=TimeZone.getAvailableIDs();
        Iterator<?> arr=new ArrayList<>(Arrays.asList(zones)).iterator();
//        while(arr.hasNext())
//        System.out.println(arr.next());
        Locale loc = Locale.CHINA;
        System.err.println("1"+loc.getDisplayLanguage());
        System.err.println("2"+loc.getISO3Country());
        System.out.println("3"+Locale.getDefault());
        
    }
}
