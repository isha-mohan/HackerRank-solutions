import java.io.*;
import java.util.*;

public class Solution {
    
    private static void plus_minus(int n, int arr[])
    {
        int no_of_p = 0;
        int no_of_n = 0;
        int no_of_z = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                no_of_z++;
            else if(arr[i]>0)
                no_of_p++;
            else
                no_of_n++;
        }
        System.out.println(no_of_p*1.0/n);
        System.out.println(no_of_n*1.0/n);
        System.out.println(no_of_z*1.0/n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = scan.nextInt();
        }
        plus_minus(size,array);
    }
}
