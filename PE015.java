import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class PE015 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
            
        int t = scan.nextInt();
        for(int idx=0;idx<t;idx++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            BigInteger a = factorial(BigInteger.valueOf(n+m));
            BigInteger b = factorial(BigInteger.valueOf(n));
            BigInteger c = factorial(BigInteger.valueOf(m));
            BigInteger Required = a.divide(b).divide(c).mod((BigInteger.valueOf(1000000007)));
    
            System.out.println(Required);
        }
    }
    private static BigInteger factorial(BigInteger a){
        BigInteger result = BigInteger.ONE;
        BigInteger addLater = BigInteger.ONE;        
        for(int idx=2;idx<=a.intValue();idx++){
            addLater = addLater.add(BigInteger.ONE);
            result = result.multiply(addLater);
        }
        return result;
    }
}