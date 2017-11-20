import java.io.*;
import java.util.*;

public class Solution {
    
    private static void staircase(int n)
    {
        for(int i=1;i<=n;i++)
        {
             for(int k=n;k>i;k--)
             {
                 System.out.print(" ");
             }    
             for(int j=1;j<=i;j++)
             {
                 System.out.print("#");
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        staircase(n);
    }
}
