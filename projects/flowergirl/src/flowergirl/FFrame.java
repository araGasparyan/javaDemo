/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowergirl;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Ara
 */
public class FFrame extends JFrame {
    private String str;
    private int count;
    private int price=0;
    private JLabel label[];
  private Icon images[];
	private JPanel panel = new JPanel();
        private JPanel panel1 = new JPanel();
    private Bouquet b;
   private Color c1 = new Color(255,0,255);
    private Color c2 =new Color(255,0,0);
     private Color c3 =new Color(255,255,255);
     private JTextArea textarea = new JTextArea(10,10);
     
        
        private void RSet(int n, int r){
            
            b = new Bouquet(n,r);
                        label = new JLabel[b.getF().length];
            images = new ImageIcon[b.getF().length];
            for (int i=0;i<b.getF().length;i++){
                label[i]=new JLabel();
               // System.out.println(b.getF()[i].toString());
               // System.out.println(b.getF()[i].getC());
                             
                if (((b.getF()[i].getName()=="Rose"))&&(c1.equals(b.getF()[i].getC())))
                {
                    images[i]=new ImageIcon("pink.gif");
                label[i].setIcon(images[i]);
                }
                
               else  if ((b.getF()[i].getName()=="Rose")&&(c2.equals(b.getF()[i].getC())))
                {
                    images[i]=new ImageIcon("red.gif");
                label[i].setIcon(images[i]);
                }
                 
                else  if ((b.getF()[i].getName()=="Rose")&&(c3.equals(b.getF()[i].getC())))
                {
                    images[i]=new ImageIcon("white.gif");
                label[i].setIcon(images[i]);
                }
                  
                   else
                {
                    images[i]=new ImageIcon("lily.gif");
                label[i].setIcon(images[i]);
                            
                }
                  price+=b.getF()[i].getPrice();
                panel.add(label[i]);
            }
            setLayout(new FlowLayout());
            add(panel);
            setLayout(new FlowLayout());
            textarea.setText(String.valueOf(price));
            panel1.add(textarea);
            add(panel1);
        }
       
   public FFrame(){
        
        
        
        str=JOptionPane.showInputDialog("Input count of flowers");
        count = Integer.parseInt(str);
        RSet(count,3);
        setSize(1500,500);
        setVisible(true);
    }
    
}
