/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingPracticeSession.Array;

/**
 *
 * @author maruthupandiyansp
 */
public class ArrayArrayList {
    Node head;
    Node tail;
    int tailIndx;
    int count;

    public ArrayArrayList() {
        head=null;
        tail=null;
        tailIndx=0;
        count=0;
    }
    
    public void insertAtEnd (int val) {
        
        if (head == null){
            head = new Node (1);
            //head.arr[0] = val;
            tail = head;
        } else if (tailIndx == tail.arr.length){
            Node temp = new Node (tailIndx*2);
            tail.next=temp;
            tailIndx=0;
        }
        
        tail.arr[tailIndx]=val;
        tailIndx++;
        count++;
        
        System.out.println("Arr: "+head.arr[0]);
    }
}
