/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

/**
 *
 * @author Ara
 */
class GridChanged implements ItemListener {
private JCheckBox grid;
    public GridChanged(BPanel bpnl) {
       grid= bpnl.grid;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
            
grid.setEnabled(e.getStateChange()==ItemEvent.SELECTED);
        
    }
    
}
