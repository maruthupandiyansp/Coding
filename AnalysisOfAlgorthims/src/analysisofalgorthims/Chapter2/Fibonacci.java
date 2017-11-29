/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.Chapter2;

/**
 *
 * @author maruthupandiyansp This is very time intensive. For first 45 it took
 * less than a minute. For first 50, it took more than a minute (1:41 mins). The
 * number have reached 12 Billion+. But it has looped more than 45 billion
 * times. b = log2 n+1; For first 75. it ran more than 75 mins and did not
 * arrive at the number.
 */
public class Fibonacci {

    static long count = 0;

    public long calcFibonacci(long n) {
        count++;
        if (n < 2) {
            return n;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }

    public long getCount() {
        return count;
    }

    /**
     * This is super quick because we are storing the value we are calculating.
     * Took less than 1 sec to find the first 75 (n) numbers. It looped n-1 times.
     * Space is n+1 as well. Very efficient while comparing to the above. 
     * Space complexity: O(n) - Linear 
     * Time Complexity: O(n) - Linear 
     * @param n @return
     */
    public long calcFibncExtraSpace(int n) {

        long[] fibArr = new long[n + 1];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
            count++;
        }

        return fibArr[n];
    }

    /**
     * This is super quick because we are storing the value we are calculating.
     * Took less than 1 sec to find the first 75 (n) numbers. It looped n-1 times.
     * Needs only Space array of size 3 as well. Very efficient while comparing
     * to the above two. 
     * Space complexity: O(3) - Constant 
     * Time Complexity: O(n) - Linear
     * @param n @return
     */
    public long calcFibEffSpace(int n) {
        
        // We can you normal variable instead of Array as well. int a,b,c;
        long[] fibArr = new long[3];
        fibArr[0] = 0;
        fibArr[1] = 1;
        
        // For n == 0 logic, return fibArr[0] else fibArr[1]
        if (n < 2) {
            return fibArr[n];
        } else {

            for (int i = 2; i <= n; i++) {
                fibArr[2] = fibArr[1] + fibArr[0];
                fibArr[0] = fibArr[1];
                fibArr[1] = fibArr[2];
                count++;
            }

            return fibArr[2];
        }
    }
}
