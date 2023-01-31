//Collatz length
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CS210lab12 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        
        long[] array=new long[(int)(b-a+1)]; // input range array
        long[] array2=new long[(int)(b-a+1)]; // array of collatz lengths
        
        for(int i=0;i<array.length;i++){
            array[i]= a+i;
            array2[i]=collatz(a+i);
        }
        
        
        //troubleshooting code
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //Arrays.sort(array2);
        //System.out.println(array2[c]);
        for(int i=0;i<array.length;i++){
            System.out.println(array2[i]);
        }
        
        
        
    }
    public static long collatz(long n){
        
            long count = 0;
            while(n!=1){
                if((n&1)==1){
                    n=3*n+1;
                    count++;
                }
                else{
                    n=n/2;
                    count++;
                }
            }
        
        return count;
            
        
    }
}