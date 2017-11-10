/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter1;

/**
 *
 * @author maruthupandiyansp
 */
public class Euclid_GCD_HCF {
    int m, n;
    protected void findGCD (int a, int b){
        m=a;
        n=b;
        int j=0;
        //System.out.println("Value of j is "+j +" m is "+m +" n is "+ n);
        do {
            j = m%n;
            m = n;
            n = j;
            //System.out.println("Value of j is "+j +" m is "+m +" n is "+ n);
        } while (j!=0);
        System.out.println("The GCD is "+m);
    }    
}
