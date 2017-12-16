import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int maximumHourGlass(int[][] arr)
    {
        int top=0,mid=0,bottom=0,max=-99999;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                top = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                mid = arr[i+1][j+1];
                bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                if(max<(top+mid+bottom))
                {
                    max = top+mid+bottom;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        System.out.println(maximumHourGlass(arr));
    }
}
