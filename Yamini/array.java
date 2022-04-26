//DAY 1

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int[] a = new int [n]; // n is the size of array
//input
for(int i=0; i<n; i++ ) /*In Java index starts from 0 and i is denoting the index.If we don't initialize the array then it will take 0 value by default*/
{
    a[i]= scan.nextInt();
}

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
