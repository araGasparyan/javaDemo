/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;


import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import javafx.scene.control.ComboBox;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Ara
 */
class BPanel extends JPanel {
public JLabel [] l;
public ButtonGroup chbg;
public JRadioButton [] chb;
public JCheckBox grid;
public JComboBox ch;
public JTextField tf;
public JButton b1,b2;
String combostring [] ={
    "կանաչ", "դեղին","մոխրագույն"
};

    BPanel(int x, int y, int W, int H) {
        setLayout(null);
        setBounds(x, y, W, H);
        setBackground(Color.LIGHT_GRAY);
        l=new JLabel[3];
        l[0]=new JLabel("Գույնի ընտրություն", JLabel.CENTER);
        l[0].setFont(new Font("Unicode",Font.BOLD,10));
        l[0].setBounds(5, 5, getWidth()-10, 30);
        add(l[0]);
        
        chbg= new ButtonGroup();
        chb = new JRadioButton[3];
        chb[0]=new JRadioButton("կարմիր", true);
        chb[1]=new JRadioButton("կապույտ",false);
        chb[2]=new JRadioButton("սև",false);
        grid=new JCheckBox("ցանց",true);
        
        for (int i = 0; i < chb.length; i++) {
            chb[i].setBounds(5, 30+i*25, getWidth()-10, 30);
            chbg.add(chb[i]);
            add(chb[i]);
            if(i==chb.length-1){ grid.setBounds(5, 30+(i+1)*25, getWidth()-10, 30);
              //  System.out.println(i);
            add(grid);
            }
        }
        
        ch = new JComboBox(combostring);
        ch.setFont(new Font("Unicode",Font.BOLD,10));
                ch.setBounds(20, 140, getWidth()-25, 30);
         add(ch);
         
         l[1]=new JLabel("Ինտերվալ ըստ x-ի", JLabel.CENTER);
         l[1].setFont(new Font("Unicode",Font.BOLD,10));
        l[1].setBounds(5, 220, getWidth()-10, 30);
        add(l[1]);
        
        l[2]=new JLabel("x=0-ից   x=", JLabel.LEFT);
        l[2].setBounds(5, 250, 70, 20);
        add(l[2]);
        
        tf=new JTextField("10");
        tf.setBounds(75, 250, 45, 20);
        add(tf);
        
        b1=new JButton("Նկարել");
                b2=new JButton("Փակել");
        b1.setBounds(5, getHeight()-75, getWidth()-10, 30);
        b2.setBounds(5, getHeight()-35, getWidth()-10, 30);
        add(b1);
        add(b2);
        
        
      
        
        
        
        
        
    }
    
}
