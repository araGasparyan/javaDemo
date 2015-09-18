/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Ara
 */
class HPanel extends JPanel {
    public JLabel l;
    public JTextArea ta;
    
    

    HPanel(int i, int i0, int i1, int i2) {
        setBackground(Color.LIGHT_GRAY);
        setBounds(i, i0, i1, i2);
        setLayout(null);
        l = new JLabel("Նշում", JLabel.CENTER);
        l.setBounds(0, 0, i1, 20);
        add(l);
        ta=new JTextArea("y(x)=(1+sin(x))/(1+|x|) ֆունկցիայի գրաֆիկը");
        ta.setFont(new Font("Unicode",Font.PLAIN,15));
ta.setBounds(5, 20, i1-10, 50);
ta.setEditable(false);
add(ta);
    }
    
    
}
