/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.bitset;

import java.util.BitSet;

/**
 *
 * @author matenadaran
 */
public class BitSetDemo1 {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet();
        BitSet bits2 = new BitSet(16);
        
        bits1.set(1);
         bits1.set(2);
          bits1.set(3);
          bits2.set(2);
          bits2.set(3);
          bits2.set(5);
          bits2.set(4);
          
          System.out.println(bits1);
         System.out.println(bits2);
          //bits2.andNot(bits1);
          for (int i = 0; i < bits1.toByteArray().length; i++) {
              System.out.println(bits1.toByteArray().length);
            
        }
          //System.out.println();
          
          long l []=bits1.toLongArray();
          System.out.println(l.length);
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
    }
}
