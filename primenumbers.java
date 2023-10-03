//CS210 Lab One
import java.util.Scanner;
public class primenumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1: Check if a number is prime");
        System.out.println("2: Check the prime numbers in a range");

        int input = sc.nextInt();

        if(input == 1){
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            if(num <= 1 || num <= 2 || num ==5){
                System.out.println(num+" is Prime number");
            }
            else if(num %2==0 || num %3==0 || num%5==0){
                System.out.println(num+" is not Prime number");
            }
            else{
                System.out.println(num+" is Prime number");
            }

        }
        else if(input == 2){
            System.out.println("Enter two numbers:");
            int low = sc.nextInt();
            int high = sc.nextInt();
            System.out.print("Prime numbers in the range ["+low+","+high+"]: ");
            for(int i = low-1;i<=high;i++){
                if(i <= 1 || i <= 2 || i==5){
                    System.out.print(i +" ");
            }
                else if(i %2==0 || i %3==0 || i%5==0){
                    
            }
                else{
                    System.out.print(i+" ");

            }
            

        }
        sc.close();
    }
    }
}