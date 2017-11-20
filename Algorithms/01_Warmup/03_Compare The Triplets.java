import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static void solve(int arr1[],int arr2[]){
        int alice = 0;
        int bob=0;
        for(int i=0;i<3;i++)
        {
            if(arr1[i]>arr2[i])
                alice++;
            else if(arr1[i]<arr2[i])
                bob++;
        }
        System.out.println(alice+" "+bob);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for(int i=0;i<3;i++)
            arr1[i] = in.nextInt();
        for(int i=0;i<3;i++)
            arr2[i] = in.nextInt();

        solve(arr1,arr2);
    }
}
