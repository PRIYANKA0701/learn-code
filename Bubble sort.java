import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void countSwaps(int[] a) {
        int count=0,i,temp;
        int j;
        int n = a.length;
        for( i=0;i<n;i++)
        {
            for( j=0;j<n-1;j++)
            {
            if(a[j]>a[j+1])
               {
                    temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                count++;
               }
            }
  
        }    
                System.out.println("Array is sorted in "+ count + " swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        
}


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
