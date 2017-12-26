import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE010 {

    public static void main(String[] args) {
        //add primes
        List<Long> primeList = new ArrayList<Long>();
        primeList.add((long)2);
        primeList.add((long)3);
        primeList.add((long)5);
        //int primeCounter = 3;
        long primeNum = 7;
        while(primeNum<1000002){
            if(isPrime(primeNum)){
                //primeCounter++;
                primeList.add(primeNum);
            }
            primeNum+=2;
        }
        //input
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long result = 0;
            for(int idx=0;idx<primeList.size();idx++){
                if(primeList.get(idx)<=n){
                    result+=primeList.get(idx);
                }
                else break;
            }
            System.out.println(result);
        }
    }
    private static boolean isPrime(long a){
        for(long idx=2;idx<=(long)(Math.sqrt(a));idx++){
            if(a%idx == 0)return false;
        }
        return true;
    }
}
