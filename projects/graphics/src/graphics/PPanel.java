/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.concurrent.ForkJoinPool;
import javax.swing.JPanel;

/**
 *
 * @author Ara
 */
class PPanel extends JPanel {
public Plotter G;

//inner class
    class Plotter {
private double Xmin=0, Xmax, Ymin=0, Ymax=1.0;
private boolean status;
private Color clr;
private Color gclr;

Plotter(BPanel p){
    try{
    Xmax=Double.valueOf(p.tf.getText());
    }catch(NumberFormatException e){
        p.tf.setText("10");
        Xmax=10;
    }
    status=p.grid.isSelected();
    
    switch(p.ch.getSelectedIndex()){
        case 0:
            gclr=Color.GREEN;
            break;
            case 1:
            gclr=Color.YELLOW;
            break;
                default:
            gclr=Color.GRAY;
            break;
    }
    
   String name ="";
    for (int i = 0; i < p.chb.length; i++) {
       if(p.chb[i].isSelected()){
          // System.out.println(p.chb[i].isSelected());
            name=p.chb[i].getText();
          //  System.out.println(name);
            break;
       }
          }

    if(name.equalsIgnoreCase("կարմիր")) clr=Color.RED;
    else if(name.equalsIgnoreCase("կապույտ")) clr=Color.BLUE;
    else clr=Color.BLACK;
    }
private double f(double x){
    return (1+Math.sin(x))/(1+Math.abs(x));
}

public Plotter rememeber(BPanel p){
       return new Plotter(p);
    }

public void plot(Graphics fig){
    int H,W,h,w,s=20;
    H=getHeight();
    W=getWidth();
    h=H-2*s;
    w=W-2*s;
    
  fig.clearRect(0, 0, W, H);
    
    int k, nums = 10;
    
    fig.setColor(Color.BLACK);
    
    fig.drawLine(s, s, s, h+s);
     fig.drawLine(s, s+h, s+w, h+s);
    
     for (k = 0; k <= nums; k++) {
        fig.drawLine(s+k*w/nums, s+h, s+k*w/nums, h+s+5);
      fig.drawLine(s-5, s+k*h/nums, s,s+k*h/nums);
        fig.drawString(Double.toString(Xmin+k*(Xmax-Xmin)/nums), s+k*w/nums, s+h+15);
         fig.drawString(Double.toString(Ymin+k*(Ymax-Ymin)/nums), s-17, s+h-1-k*h/nums);
    }
    
     if(status){
         fig.setColor(gclr);
         for (k = 1; k <= nums; k++) {
        fig.drawLine(s+k*w/nums, s, s+k*w/nums, h+s);
    fig.drawLine(s, s+(k-1)*h/nums, s+w,s+(k-1)*h/nums);
       
    }
     }
     
     
     fig.setColor(clr);
     double dx=(Xmax-Xmin)/w,dy=(Ymax-Ymin)/h;
     double x1,x2,y1,y2;
     int h1,h2,w1,w2;
     x1=Xmin;
     y1=f(x1);
     w1=s;
     h1=h+s-(int)Math.round(y1/dy);
     int step = 5;
     
     for (int i = step; i <=w; i+=step) {
       x2=i*dx;
        y2=f(x2);
        w2=s+(int)Math.round(x2/dx);
        h2=h+s-(int)Math.round(y2/dy);
        fig.drawLine(w1, h1, w2, h2);
        
        fig.drawRect(w1-2, h1-2, 4, 4);
        
        x1=x2;
        y1=y2;
        w1=w2;
        h1=h2;
    }
     
     
     
}
        
    }
    
    
      PPanel(int i, int i0, int i1, int i2, BPanel BPnl) {
        G=new Plotter(BPnl);
          setBackground(Color.MAGENTA);
          setBounds(i, i0, i1, i2);
          
    }
      
      
@Override
      public void paint(Graphics g){
          G.plot(g);
          repaint();
      }
      
      
    
}
