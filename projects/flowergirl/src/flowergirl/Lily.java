/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowergirl;

import java.awt.Color;

/**
 *
 * @author matenadaran
 */
public class Lily extends Flower{





public Lily() {
        setStem(20+(Math.random()*50));
        setC(color());
        setP(petal());
       setF(fresh());
        setPrice(price());
       setName("Lily");
    }

    public Lily(double stem, int p, int f) {
        super(stem, p, f);
        setC(color());
        setPrice(price());
         setName("Lily");
    }

    
    
    
   

    @Override
    protected Color color() {
        try{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }catch( UnsupportedOperationException e){
        return new Color(255,255,255);
    }
    }

    @Override
    protected int petal() {
        try{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }catch(UnsupportedOperationException e){
        return (int)(1+Math.random()*7);
    }}

    @Override
    protected void smell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected int fresh() {
        return (int)(Math.random()*2);
    }
    
     @Override
    protected double price() {
        return (1000+500*getF()+100*getStem());
    }
}
