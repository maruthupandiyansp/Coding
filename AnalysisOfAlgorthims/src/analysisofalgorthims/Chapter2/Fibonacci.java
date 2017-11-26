/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter2;

/**
 *
 * @author maruthupandiyansp
 * This is very time intensive. For first 45 it took less than a minute.
 * For first 50, it took more than a minute (1:41 mins). The number have reached 12 Billion+. 
 * But it has looped more than 45 billion times. b = log2 n+1;
 * For first 75. it ran more than 75 mins and did not arrive at the number.
 */
public class Fibonacci {
    static long count=0;

    public long calcFibonacci(long n) {
        count++;
        if (n < 2) {
            return n;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }
    
    public long getCount(){
        return count;
    }
}
