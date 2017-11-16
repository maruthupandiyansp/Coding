/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter2;

/**
 *
 * @author maruthupandiyansp
 */
public class BinaryNumbers {
    
    public void noOfBinaryDigits (int iNo){
        int iCount=0;
        int iMod=iNo;
        
        while (iMod > 0){
            iMod=iMod/2;
            iCount++;
        }
        
        System.out.println ("Number of Binary Digits on "+iNo+ " is: "+iCount);
    }
    
    public void calcBinaryNo (int iNo){
        String binary="";
        Integer iMod=new Integer(0);
        int iDiv=iNo;
        while (iDiv > 0){
            // Get the reminder and assign it to String and concatenate as well.
            binary=(iDiv%2)+binary;
            iDiv=iDiv/2;
        }
        System.out.println ("Number of Binary Digits on "+iNo+ " is: "+binary);
    }
}
