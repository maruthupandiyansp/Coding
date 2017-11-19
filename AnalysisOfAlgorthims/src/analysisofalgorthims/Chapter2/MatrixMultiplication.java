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
public class MatrixMultiplication {
    int[][] firstArray = {{1,2,3}, {3,4,5}};
    int[][] secondArray = {{5,6,7}, {7,8,9}};
    
    public void mulMatrix (){
        System.out.println("first Array: "+firstArray.length);
        System.out.println("second Array: "+ secondArray.length);
        for (int i=0; i<firstArray.length; i++){
            for (int j=0; j<firstArray.length; j++){
                for (int k =0; k<secondArray.length; k++){
                    for (int l =0; l<secondArray.length; l++){
                    System.out.println("I J K L "+i+j+k+l+": "+firstArray[i][j]*secondArray[k][l]);
                    }
                }
            }
        }
    }
}
