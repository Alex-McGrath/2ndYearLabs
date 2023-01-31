//The task is to take two integers that specify a range and output the quantity of prime numbers that exist in that range,
// inclusive of the specified boundaries. 
//For example, the quantity of prime numbers that exist between 7 and 19 is 5 (namely 7, 11, 13, 17 and 19).
import java.util.*;

public class CS210lab4 {
    public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
            int input1 = sc.nextInt();
            int low; int high;
            int input2 = sc.nextInt();
            int primes = 0;
            
            if(input1 > input2){
                high = input1;
                low = input2;
            }
            else{
                high = input2;
                low = input1;
            }
            //ensuring that the int low, is set to the lowest value int from the inputs and vice versa with high
            
            
            if(low<2){
                low=2;
            }
            //as 0 and 1 are both not primes, setting the low to 2 avoids them
            
            
            for(int i = low;i<=high;i++){
                //i is the int that needs to be checked whether or not its prime
                
               boolean test =false;
               // setting the boolean to false unless I is a prime
               
               for(int n=2;n<=i/2;n++){
                   //starting at 2 and looping to half of I 
                    if(i%n==0){
                        //I % n equals zero the number mustn ot be prime
                        test = true;
                        //setting the boolean value to true as the num is prime
                        break;
                        //exiting the loop
                    }
               }
               if(!test){
                   primes++; 
                   //if not the boolean then increment the amount of prime NOs 
               }
            }
            System.out.println(primes);
            //Print out the amount of prime numbers adding up throughout the loops
    }
}