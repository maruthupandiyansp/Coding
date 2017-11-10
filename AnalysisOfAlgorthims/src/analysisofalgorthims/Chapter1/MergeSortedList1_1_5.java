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
public class MergeSortedList1_1_5 {
    int[] firstList = {2, 5}; //, 7, 12, 13, 24};
    int[] secondList = {1, 6}; //, 15, 17, 35};
    
    public void mergeSortedList (){
        int i=0,j=0,k=0;
        int n=firstList.length+secondList.length;
        System.out.println("n is "+n);
        int[] mergedList=new int[100];
        do{
            System.out.println("i="+i+" j="+j+" k="+k);
            System.out.println("firstList["+i+"]="+firstList[i]);
            System.out.println("secondList["+j+"]="+secondList[j]);
            if (firstList[i] > secondList[j]){
                mergedList[k]=secondList[j];
                if ((j+1) < secondList.length){
                    ++j;
                }
            } else {
                mergedList[k]=firstList[i];
                if ((i+1) < firstList.length){
                    ++i;
                }
            }
            System.out.println("mergedList["+k+"]="+mergedList[k]);
            k++;
        } while (i<firstList.length || j<secondList.length);
        
        for (int m=0; m<mergedList.length; m++){
            System.out.println(mergedList[m] +" ");
        }
    }
    public void mergeSortedListFor (){
        int i=0,j=0,k=0;
        int n=firstList.length+secondList.length;
        System.out.println("n is "+n);
        int[] mergedList=new int[5];
        for (i=0; i < firstList.length; i++){
            for (j=0; j<secondList.length; j++){
                System.out.println("i="+i+" j="+j+" k="+k);
                System.out.println("firstList["+i+"]="+firstList[i]);
                System.out.println("secondList["+j+"]="+secondList[j]);
                if (firstList[i] > secondList[j]){
                    mergedList[k]=secondList[j];
                } else {
                    mergedList[k]=firstList[i];
                }
                System.out.println("mergedList["+k+"]="+mergedList[k]);
                k++;
            }
        }
        
        for (int m=0; m<mergedList.length; m++){
            System.out.println(mergedList[m] +" ");
        }
    }
}
