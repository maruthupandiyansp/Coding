/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter1;

/**
 * Looping through the Array twice. Time complexity is n*n For ArrayLength 3, it
 * will take 9 recursive & for 14, its 196
 *
 * @author maruthupandiyansp
 */
public class Sorting1_1_4 {
    //int[] unsortedArray = {23, 45, 12, 37, 11};
    
    /**
     * Brute force.
     * Time Complexity: O(n^2)
     * @param unsortedArray 
     */
    public void sortArrayBruteForce(int[] unsortedArray) {
        int count = 0;
        boolean arraySorted;
        int aryLen = unsortedArray.length;
        // 2 for loops to run through array twice to sort them
        for (int i = 0; i < aryLen; i++) {
            //++count;
            arraySorted = true;
            for (int j = 0; j < aryLen; j++) {
                ++count;
                if (j + 1 != aryLen) {
                    if (unsortedArray[j] > unsortedArray[j + 1]) {
                        int temp = unsortedArray[j];
                        unsortedArray[j] = unsortedArray[j + 1];
                        unsortedArray[j + 1] = temp;
                        arraySorted = false;
                    }
                }
            }
            if (arraySorted) {
                break;
            }
        }
        System.out.println();
        System.out.println("Total number of loops for array length " + aryLen + " is " + count);
        System.out.println("Sorted List:");
        for (int k = aryLen-1; k >= 0; k--) {
            //System.out.println("Element of Array at ["+k+"] is "+unsortedArray[k]);
            System.out.print(unsortedArray[k] + ", ");
        }

        System.out.println();
    }

    /**
     * This is 50% efficient that Brute Force. No of swaps were 143 & count was 153.
     * Time Complexity: O(n^2)
     * @param unsortedArr
     */
    public void selectionSort(int[] unsortedArr) {
        int count = 0;
        int arrLen = unsortedArr.length;
        int min;
        int swap = 0;

        System.out.println("Count: " + count);
        for (int k = 0; k < unsortedArr.length; k++) {
            System.out.print(unsortedArr[k] + " ");
        }
        System.out.println("");
        System.out.println("Array Length: " + arrLen);
        for (int i = 0; i < arrLen - 1; i++) {
            min = unsortedArr[i];

            System.out.println("Min Value: " + min);

            for (int j = i + 1; j < arrLen; j++) {
                count++;

                if (min > unsortedArr[j]) {
                    unsortedArr[i] = unsortedArr[j];
                    unsortedArr[j] = min;
                    min = unsortedArr[i];
                    swap++;
                }
            }
            System.out.println("Count: " + count);
            for (int k = 0; k < unsortedArr.length; k++) {
                System.out.print(unsortedArr[k] + " ");
            }
            System.out.println("");

        }
        System.out.println("No of total Swaps: " + swap);
        System.out.println("Count: " + count);
        for (int k = 0; k < unsortedArr.length; k++) {
            System.out.print(unsortedArr[k] + " ");
        }
        System.out.println("");
    }
}
