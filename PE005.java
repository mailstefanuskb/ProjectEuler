import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String result = "";
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            if(!result.equalsIgnoreCase(""))result+="\n";
            result+=lcm(n);
        }
        System.out.println(result);//print end result
    }
    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long input)
    {
        long result = 1;
        for(int i = 1; i <= input; i++) result = lcm(result, i);
        return result;
    }
}
