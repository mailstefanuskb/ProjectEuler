import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            
            char c[] = num.toCharArray();
            int a[] = new int [c.length];
            
            for(int i=0;i<c.length;i++)
            {
                a[i] = Integer.parseInt(String.valueOf(c[i]));
            }
            int max = 0;
            for(int i=0;i<a.length-k;i++)
            {
                int temp = 1;

                for(int j=i;j<k+i;j++)
                {
                    temp = temp*a[j];

                }
                if(max < temp)
                    max = temp;
            }
            System.out.println(max);
        }
    }
}
