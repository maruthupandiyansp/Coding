/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter2;

import java.util.Scanner;

/**
 *
 * @author maruthupandiyansp
 */
public class MatrixMultiplication {

    Scanner sc = new Scanner(System.in);

    /**
     * This can take 2 matrix as input
     */
    public void getInputMatrix() {
        int aMatrixRow, aMatrixColmn, bMatrixRow, bMatrixColmn;
        boolean toContinue = true;
        try {
            System.out.println("Enter the number of Rows for Matrix A: ");
            aMatrixRow = sc.nextInt();

            System.out.println("Enter the Number of Columns for Matrix A: ");
            aMatrixColmn = sc.nextInt();

            System.out.println("Enter the number of Rows for Matrix B: ");
            bMatrixRow = sc.nextInt();

            while (aMatrixColmn != bMatrixRow) {
                System.out.println("Matrix B Row should be same as Matrix A Column");

                System.out.println("Do you want to continue... true/false? ");
                toContinue = sc.nextBoolean();
                if (toContinue) {
                    System.out.println("Enter the number of Rows for Matrix B: ");
                    bMatrixRow = sc.nextInt();
                } else {
                    break;
                }
            }
            if (toContinue) {
                System.out.println("Enter the Number of Columns for Matrix B: ");
                bMatrixColmn = sc.nextInt();

                int matrixA[][] = new int[aMatrixRow][aMatrixColmn];
                int matrixB[][] = new int[bMatrixRow][bMatrixColmn];
                matrixA = buildMatrix(aMatrixRow, aMatrixColmn, "A");
                matrixB = buildMatrix(bMatrixRow, bMatrixColmn, "B");
                System.out.println("Print Matrix A: ");
                printIxJMatrix(matrixA);
                System.out.println("Print Matrix B: ");
                printIxJMatrix(matrixB);
                
                int matrixC[][] = new int [aMatrixRow][bMatrixColmn];
                matrixC = mulNxMMatrix (matrixA, matrixB);
                System.out.println("Print Matrix C: ");
                printIxJMatrix(matrixC);
                
            } else {
                System.out.println("Matrix B Row should be same as Matrix A Column. Exiting... ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will get user input and build the matrix.
     * @param row
     * @param column
     * @param matrixNo
     * @return 
     */
    public int[][] buildMatrix(int row, int column, String matrixNo) {
        int[][] inputMatrix = new int[row][column];
        try{
        for (int a = 0; a < row; a++) {
            for (int b = 0; b < column; b++) {
                System.out.println("Enter Matrix "+matrixNo+" Row: "+a+" Column: "+b);
                inputMatrix[a][b] = sc.nextInt();
            }
        }
        } catch (Exception e){
            e.printStackTrace ();
        }
        
        return inputMatrix;
    }
    
    /**
     * This Method does the N*M Matrix Multiplication
     * @param matrixA
     * @param matrixB
     * @return 
     */
    public int[][] mulNxMMatrix (int[][] matrixA, int[][] matrixB){
        int aIntRow = matrixA.length;
        int aIntCol = matrixA[0].length;
        int bIntCol = matrixB[0].length;
        
        int matrixC[][] = new int[aIntRow][bIntCol];
        
        for (int a=0; a < aIntRow; a++){
            for (int b=0; b < bIntCol; b++){
                for (int c=0; c<aIntCol; c++){
                    matrixC[a][b]=matrixC[a][b] + (matrixA[a][c]*matrixB[c][b]);
                }
            }
        }
        
        return matrixC;
    }
    
    /**
     * Prints the Matrix
     * @param matrix 
     */
    public void printIxJMatrix (int[][] matrix){
        int aIntRow = matrix.length;
        int aIntCol = matrix[0].length;
        
        for (int i=0; i<aIntRow; i++){
            for (int j=0; j<aIntCol; j++){
                System.out.print(matrix[i][j]+" ");
            }            
            System.out.println("");
        }
        System.out.println("");
    }
}
