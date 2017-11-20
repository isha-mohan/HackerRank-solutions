import java.io.*;
import java.util.*;

public class Solution {

    private static int diagonal(int n, int array[][])
    {
        int p_diagonal = 0;
        int s_diagonal = 0;
        for(int i=0;i<n;i++)
        {
            p_diagonal = p_diagonal + array[i][i];
        }
        for(int i=0;i<n;i++)
        {
            s_diagonal = s_diagonal + array[i][n-1-i];
        }
        return Math.abs(p_diagonal-s_diagonal);
    }
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(diagonal(n,arr));
    }
}
