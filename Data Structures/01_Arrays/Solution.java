/* 
  Run for loop 
  from i = size-1 to i = 0
  print the array element;
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        printReverseList(arr,n);
    }
    private static void printReverseList(int arr[],int size)
    {
        for(int i=size-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
