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
public abstract class Flower {
   String name;
    private double price;
  //cox
    private double stem;
    private Color c;
   //tertik
    private int p;
    private int f;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStem() {
        return stem;
    }

    public void setStem(double stem) {
        this.stem = stem;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
    
    

    public Flower() {
        
    }

    

    public Flower(double stem, Color c, int f) {
        this.stem = stem;
        this.c = c;
        this.f=f;
        this.p=petal();
        this.price = price();
    }

    public Flower(double stem, int p, int f) {
        this.stem = stem;
        this.p = p;
        this.f = f;
    }

    @Override
    public String toString() {
        return "Flower{" + "name=" + name + ", price=" + price + ", stem=" + stem + ", c=" + c + ", p=" + p + ", f=" + f + '}';
    }

    
    
    
    
    
    
   protected abstract Color color();
protected abstract int petal();
protected abstract int fresh();
protected abstract double price();
protected abstract void smell();
    
}
