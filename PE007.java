import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE007 {
	public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String result = "";
        List<Long> primeList = new ArrayList<Long>();
        primeList.add((long)2);
        primeList.add((long)3);
        primeList.add((long)5);
        int primeCounter = 3;
        long primeNum = 7;
        while(primeCounter<10000){
            if(isPrime(primeNum)){
                primeCounter++;
                primeList.add(primeNum);
            }
            primeNum+=2;
        }
        int t = scan.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = scan.nextInt();
            if(!result.equalsIgnoreCase(""))result+="\n";
            result+=primeList.get(n-1);
        }
        System.out.println(result);//print end result
    }
    private static boolean isPrime(long a){
        for(long idx=2;idx<=(long)(Math.sqrt(a));idx++){
            if(a%idx == 0)return false;
        }
        return true;
    }
}
