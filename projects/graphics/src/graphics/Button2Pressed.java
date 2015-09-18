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
class Button2Pressed implements ActionListener{

    public Button2Pressed() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       System.exit(0);
    }

  
}
