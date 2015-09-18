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
public class Rose extends Flower {

    public Rose() {
        setStem(10+(Math.random()*40));
        setC(color());
        setP(petal());
       setF(fresh());
        setPrice(price());
        setName("Rose");
    }



    public Rose(double stem, Color c, int f) {
        super(stem,c,f);
         setName("Rose");
    }

    
    @Override
    protected Color color() {
    int x=(int)(Math.random()*3);
    if (x==0) return new Color(255,0,255);
    else if (x==1) return new Color(255,0,0);
    else return new Color(255,255,255);
    }

    @Override
    protected int petal() {
       if(getStem()>30) return 20;
       else return 5;
    }

    @Override
    protected void smell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double price() {
        if ((getStem()>25)&&(getC()==(new Color(255,0,0)))) return (2000+500*getF());
        else return (1500+500*getF());
    }

    @Override
    protected int fresh() {
        return (int)(Math.random()*3);
    }
    
}
