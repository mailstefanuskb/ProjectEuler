import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] FiboNum = new long[1000];
        FiboNum[0]=0;
        FiboNum[1]=2;
        
        for(int idx=2;idx<1000;idx++){
            FiboNum[idx]=4*FiboNum[idx-1]+FiboNum[idx-2];
        }
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long total = 0;
            for(long fb : FiboNum){
                if(fb<=n){
                    total+=fb;
                }
                else break;
            }
            System.out.println(total);
        }
    }
}