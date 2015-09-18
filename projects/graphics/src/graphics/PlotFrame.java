/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import javafx.stage.WindowEvent;
import javax.swing.*;

/**
 *
 * @author Ara
 */
public class PlotFrame extends JFrame {

    public PlotFrame(int H, int W) {
        setTitle("Ֆունկցիայի գրաֆիկ");
        setBounds(100, 50, W, H);
        setBackground(Color.gray);
        setLayout(null);
        
        //define a font and set it
      //  Font f=new Font("Arial",Font.BOLD,11);
      //  setFont(f);
        
        
        //add panels
        BPanel bpnl=new BPanel(2,3,W/4,H-33);
      add(bpnl);
         PPanel ppnl=new PPanel(W/4+5,3,3*W/4-15,H-110,bpnl);
      add(ppnl);
       HPanel hpnl=new HPanel(W/4+5,H-104,3*W/4-15,74);
      add(hpnl);
      
      //closing of frame
        addWindowListener(new WindowAdapter() {
          

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
               System.exit(0);
            }
}
        );
        
        
       bpnl.b1.addActionListener(new Button1Pressed(bpnl,ppnl));
         bpnl.b2.addActionListener(new Button2Pressed());
         bpnl.grid.addItemListener(new GridChanged(bpnl));
        
        setResizable(false);
        setVisible(true);
    }
    
    
    
}
