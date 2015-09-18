/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ara
 */
class Button1Pressed implements ActionListener {
private BPanel p1;
private PPanel p2;
    public Button1Pressed(BPanel p1, PPanel p2) {
        this.p1=p1;
        this.p2=p2;
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        p2.G=p2.G.rememeber(p1);
        p2.G.plot(p2.getGraphics());
    }
    
}
