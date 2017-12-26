import java.util.*;
import java.io.*;
import java.math.BigInteger;
/**
 *
 * @author StefanusKB
 */
public class PE012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        List<Integer> triNumbers = new ArrayList<Integer>();
        List<Long> triFactors = new ArrayList<Long>();
        //
        int total = 0;
        for(int idx=1;idx<=44000;idx++){
            total+=idx;
            triNumbers.add(total);
            triFactors.add(howManyFactors(BigInteger.valueOf(total)));
        }        
        int t = scan.nextInt();
        for(int idx=0;idx<t;idx++){
            int n = scan.nextInt();
            for(int i=0;i<triFactors.size();i++){
                if(triFactors.get(i)>n){
                    System.out.println(triNumbers.get(i));
                    break;
                }
            }
        }
    }
    private static long howManyFactors(BigInteger number){
        BigInteger x = new BigInteger("2");
        long totalFactors = 1;
        while (x.multiply(x).compareTo(number) <= 0) {
            int power = 0;
            while (number.mod(x).equals(BigInteger.ZERO)) {
                power++;
                number = number.divide(x);
            }
            totalFactors *= (power + 1);
            x = x.add(BigInteger.ONE);
        }
        if (!number.equals(BigInteger.ONE)) {
            totalFactors *= 2;
        }
        return totalFactors;
    }
    
}
