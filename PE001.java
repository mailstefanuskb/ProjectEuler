import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findSum(n-1));
        }
    }
    
    public static long findSum(int num){
        long d3 = num/3;
        long d5 = num/5;
        long d15 = num/15;
        long sum3 = (long)(3*d3*(d3+1)/2);
        long sum5 = (long)(5*d5*(d5+1)/2);
        long sum15 = (long)(15*d15*(d15+1)/2);
        return sum3+sum5-sum15;
    }
}