package analysisofalgorthims;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import analysisofalgorthims.Chapter1.Euclid_GCD_HCF;
import analysisofalgorthims.Chapter1.ListPrimeNos;
import analysisofalgorthims.Chapter1.MergeSortedList1_1_5;
import analysisofalgorthims.Chapter1.Sorting1_1_4;
import analysisofalgorthims.Chapter2.BinaryNumbers;
import analysisofalgorthims.Chapter2.Fibonacci;
import analysisofalgorthims.Chapter2.MatrixMultiplication;
import analysisofalgorthims.Chapter2.UniqueElementsArray;
import analysisofalgorthims.DiceGame.DiceGame;

/**
 *
 * @author maruthupandiyansp
 */
public class MP_AlgorithmsMain {
    //static int[] unsortedArray = {23, 45, 65, 78, 45, 12, 37, 10987, 11, 123, 8, 4, 87, 97, 6, 42, 11111, 1};
    static int[] unsortedArray = {11111, 10987, 123, 97, 87, 78, 65, 45, 45, 42, 37, 23, 12, 11, 8, 6, 4, 1};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorting1_1_4 sort = new Sorting1_1_4();
        //sort.selectionSort(unsortedArray);
        sort.selectionSort(unsortedArray);
        /*Fibonacci oFib = new Fibonacci();
        System.out.println("Fibonacci: " + oFib.calcFibncExtraSpace(50));
        System.out.println("Looped through: " + oFib.getCount());
        MatrixMultiplication oMM = new MatrixMultiplication();
        oMM.getInputMatrix();
        int[] unsortedArray = {23, 45, 65, 78, 45, 12, 37, 10987, 11, 123, 8, 4, 87, 97, 6, 42, 1, 11111};
        
        UniqueElementsArray oUEA = new UniqueElementsArray (unsortedArray);
        oUEA.isArrayUnique(unsortedArray);
        BinaryNumbers oBinNum = new BinaryNumbers ();
        //oBinNum.noOfBinaryDigits(1000000000);
        oBinNum.calcBinaryNo(100);
        // TODO code application logic here
        int a=65;
        int b=160;
        Euclid_GCD_HCF egcd = new Euclid_GCD_HCF();
        egcd.findGCD(a, b);
        ListPrimeNos lpn = new ListPrimeNos();
        lpn.findPrime(50);
        lpn.efficientFindPrime(50);
        //int[] unsortedArray = {23, 45, 12};
        Sorting1_1_4 sort = new Sorting1_1_4();
        sort.sortArrayBruteForce(unsortedArray);
        MergeSortedList1_1_5 merge = new MergeSortedList1_1_5();
        merge.mergeSortedListFor();
        DiceGame oDice = new DiceGame();
        oDice.gameController ();*/
    }
}
