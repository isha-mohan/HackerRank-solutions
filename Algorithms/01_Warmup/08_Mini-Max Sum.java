import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static void min_max_sum(long array[])
    {
        Arrays.sort(array);
        long min = array[0]+array[1]+array[2]+array[3];
        long max = array[1]+array[2]+array[3]+array[4];
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        min_max_sum(arr);
    }
}
