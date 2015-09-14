/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.wordNumber;

/**
 *
 * @author matenadaran
 */
public class WordGenerator {
    private static final char ZERO []={'0'};
    private static final char ONE []={'1'};
    private static final char TWO []={'A', 'B', 'C'};
    private static final char THREE []={'D', 'E', 'F'};
    private static final char FOUR []={'G', 'H', 'I'};
    private static final char FIVE []={'J', 'K', 'L'};
    private static final char SIX []={'M', 'N', 'O'};
    private static final char SEVEN []={'P', 'Q', 'R', 'S'};
    private static final char EIGHT []={'T', 'U', 'V'};
    private static final char NINE []={'W', 'X', 'Y', 'Z'};
    private static int nextArray=0;
    private static char [][] number;
    
    
    private static void InitilazeNumber(StringBuilder str){
        number=new char[str.length()][];
        int n=0;
        for (int i = 0; i < str.length(); i++) {
            n=Integer.parseInt(String.valueOf(str.charAt(i)));
        switch(n){
            case 0:
            number[i]=ZERO;
            break;
            case 1:
            number[i]=ONE;
            break;
            case 2:
            number[i]=TWO;
            break;
            case 3:
            number[i]=THREE;
            break;
            case 4:
            number[i]=FOUR;
            break;
            case 5:
            number[i]=FIVE;
            break;
            case 6:
            number[i]=SIX;
            break;
            case 7:
            number[i]=SEVEN;
            break;
            case 8:
            number[i]=EIGHT;
            break;case 9:
            number[i]=NINE;
            break;
            
        }
        
         }
        
    }
    
    public static void generate(StringBuilder str){
        InitilazeNumber(str);
        recursion(number[nextArray], "");
        //System.out.println("");
    }
    
    private static void recursion(char c [], String begin){
        for (int i = 0; i < c.length; i++) {
        String tmp=begin+c[i];
        if(nextArray<number.length-1){
            nextArray++;
            recursion(number[nextArray],tmp);
            nextArray--;
        }
        else{
            System.out.println(tmp);
        }
        }
    }
    
    
}
