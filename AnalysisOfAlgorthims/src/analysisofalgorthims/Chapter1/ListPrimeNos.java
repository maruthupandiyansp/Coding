/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter1;

/**
 * This will list all the Prime Numbers from 2 to the given number.
 * Brute force. Try dividing all the numbers until the number by itself.
 * To find all the PrimeNo till 50, it takes 366 recursive in for loop
 * @author maruthupandiyansp
 */
public class ListPrimeNos {
    int[] primeNos = new int[350];
    int n;
    int count;
    protected void findPrime (int a){
        int j=0;
        count=1;
        try {
            int i = a;
            n=0;
            if (i > 1){
                for (j=2; j<=i; j++){
                    int k = 2;
                    
                    do{
                        ++count;
                        int l=j%k;
                        if (l==0){
                            if (j==k){
                            primeNos[n]=j;
                            n++;
                            } else {
                                //k=j+1;
                                break;
                            }
                        }
                        k++;
                    } while (k<=j);
                }
            }

            for (int k=0; k<n; k++){
                //System.out.println(primeNos[k]);
            }
            System.out.println("Total No of Primes with in "+i+" are "+n);
            System.out.println("Total Number of Counts "+count);
        } catch (Exception e){
            System.out.println("Number at which the exception happened is "+j);
        }
    }
    
    /*
    * Program works only from 5. So have to hard code 2 & 3.
    * do - while run time is cut in half by not trying to divide a number which is > than number / 2.
    * Ex: For 10, should try to divide only till 10/2 which is 5. A number is not divisibe by another
    * number which is > number / 2.
    * To find all the PrimeNo till 50, it takes 197 recursive in for loop
    */
    protected void efficientFindPrime (int a){
        int j=0;
        count=0;
        try {
            primeNos[0]=2;
            primeNos[1]=3;
            int i = a;
            ++count;
            n=2;
            if (i > 1){
                for (j=2; j<=i; j++){
                    int k = 2;
                    int m = j/2;

                    do{
                        ++count;
                        int l=j%k;
                        if (l==0){
                            break;
                        } else if (k==m) {
                            primeNos[n]=j;
                            n++;
                        }
                        k++;
                    } while (k<=m);
                }
            }

            for (int k=0; k<n; k++){
                //System.out.println(primeNos[k]);
            }
            System.out.println("Total No of Primes with in "+i+" are "+n);
            System.out.println("Total Number of Counts "+count);
        } catch (Exception e){
            System.out.println("Number at which the exception happened is "+j);
        }
    }
}
