import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(maxfactor(n));
        }
    }
    private static long maxfactor (long n)
    {
        long k = 2;
        while (k * k <= n)
        {
            if (n % k == 0) n /= k;
            else k++;           
        }
        return n;
    }
}