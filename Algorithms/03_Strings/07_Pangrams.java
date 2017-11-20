import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class Solution {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        System.out.println(getOutput(str));
    }
    private static String getOutput(String str)
    {
        return (isPangram(str)) ? "pangram" : "not pangram";
    }
    private static Boolean isPangram(String str)
    {
        String lowercase = str.toLowerCase();
        for(char letter ='a';letter<='z';letter++)
        {
            if(lowercase.indexOf(letter) < 0)
                return false;
        }
        return true;
    }

}
