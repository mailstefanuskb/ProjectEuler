import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class PE013 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt(); 
        scan.nextLine();
        // using BigInteger : Initializing at 0
        BigInteger sum = new BigInteger("0");
        String temp;
        for(int x=0;x<length;x++){
            temp = scan.nextLine();
            BigInteger tempInt = new BigInteger(temp);      
            sum = sum.add(tempInt);
        }
        String testString =  sum + "";
       System.out.println(testString.substring(0,10));
    }
}