/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowergirl;

/**
 *
 * @author matenadaran
 */
public class Bouquet {
    private Flower f[];

    public Flower[] getF() {
        return f;
    }

    public void setF(Flower[] f) {
        this.f = f;
    }
    
    public int getDim(){
        return f.length;
    }
    
    public Bouquet(int n, int r){
        f = new Flower[n];
       f = RBouquet(f,r);
    }
    
    private Flower[] RBouquet(Flower f[], int r){
        int k;
        
        for(int i=0;i<f.length;i++){
            k=(int)(Math.random()*r);
            if (k>=r-1) f[i]=new Lily();
            else f[i]=new Rose();
            //System.out.println(f[i].toString());
        }
        return f;
    }
    
    public Bouquet(Flower ... f){
   this.f=f;
    }
}
