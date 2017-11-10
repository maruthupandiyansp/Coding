/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter1;

/**
 * Looping through the Array twice.
 * Time complexity is n*n
 * For ArrayLength 3, it will take 9 recursive & for 14, its 196
 * @author maruthupandiyansp
 */
public class Sorting1_1_4 {
    //int[] unsortedArray = {23, 45, 12, 37, 11};
    
    public void sortArrayBruteForce (int[] unsortedArray){
        int count=0;
        int aryLen = unsortedArray.length;
        // 2 for loops to run through array twice to sort them
        for (int i=0; i<aryLen; i++){
            //++count;
            for (int j=0; j<aryLen; j++){
                ++count;
                if (j+1 != aryLen){
                    if (unsortedArray[j] > unsortedArray[j+1]) {
                        int temp = unsortedArray[j];
                        unsortedArray[j] = unsortedArray[j+1];
                        unsortedArray[j+1]=temp;
                    }
                }
            }
        }
        System.out.println("Total number of loops for array length "+aryLen+" is "+count);
        for (int k=0; k<aryLen; k++){
            //System.out.println("Element of Array at ["+k+"] is "+unsortedArray[k]);
            System.out.print(unsortedArray[k]+" ");
        }
    }
}