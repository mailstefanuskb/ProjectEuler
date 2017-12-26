import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE004 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String result = "";
        
        List<Integer> allPalin = new ArrayList<Integer>();
        for(int x1=100;x1<=999;x1++){
            for(int x2=x1;x2<=999;x2++){
                int num = x1*x2;
                if(isPalindrome(num)){
                    allPalin.add(num);                 
                }
            }
        }
        Collections.sort(allPalin);
        //System.out.println(allPalin.size());
        
        int t = scan.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = scan.nextInt();
            if(!result.equalsIgnoreCase(""))result+="\n";
            for(int idx=allPalin.size()-1;idx>=0;idx--){
                if(allPalin.get(idx)<n){
                    result+=allPalin.get(idx);
                    break;
                }
            }
        }
        System.out.println(result);//print end result
    }
    public static boolean isPalindrome(int num){
        String strNum = num+"";
        if(strNum.length()<6)return false;
        String strNum2 = new StringBuilder(strNum).reverse().toString();
        return (strNum.equalsIgnoreCase(strNum2)?true:false);
    }
}
