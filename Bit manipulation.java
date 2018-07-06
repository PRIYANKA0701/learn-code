import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        int a=0;int b=1;int c=0;
        for(int i=0;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
        return c;   
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
