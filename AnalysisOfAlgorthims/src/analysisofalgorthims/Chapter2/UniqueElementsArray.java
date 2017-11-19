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
public class UniqueElementsArray {

    int[] iArray = new int[10];

    public UniqueElementsArray(int[] iArgs1) {
        this.iArray = iArgs1;
    }

    public void isArrayUnique() {
        boolean isUnique = true;
        for (int i = 0; i < iArray.length - 2; i++) {
            int eleToCompare = iArray[i];
            for (int j = 1; j < iArray.length - 1; j++) {
                if (eleToCompare == iArray[j]) {
                    isUnique = false;
                    System.out.println("The Array is not Unique. Value " + iArray[i] + " is repeated...");
                    break;
                }
            }
            if (!isUnique) {
                break;
            }
        }

        if (isUnique) {
            System.out.println("Unique Array...");
        }

    }

    public void isArrayUnique(int[] iArgs1) {
        this.iArray = iArgs1;
        isArrayUnique();
    }
}
