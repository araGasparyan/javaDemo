/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import util.protectedd.Test;

/**
 *
 * @author matenadaran
 */
public class NewClass extends Test{
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	String date = sdf.format(new Date()); 
	System.out.println(date); //15/10/2013
        new Test();
       
    }
    
    
    
    void a(){
        this.x=9;
    }
}
