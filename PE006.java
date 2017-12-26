import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        //String result = "";
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sqrtL = n*(n+1)/2;
            long L = sqrtL*sqrtL;
            for(long idx=1;idx<=n;idx++){
                L-=(idx*idx);
            }
            //if(!result.equalsIgnoreCase(""))result+="\n";
            //result+=L+"";
            System.out.println(L);
        }
        //System.out.println(result);//print end result
    }
}