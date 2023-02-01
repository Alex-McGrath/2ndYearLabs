import java.util.*;
public class prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if(x%2!=0 && x%3!=0 && x%5!=0){
            System.out.println("0");
        }
        else{
            int count = 0;
            int count2 = 0;
            while((x%2==0 ||  x%3==0 ||  x%5==0)){
                count++;
                x++;
            }
            x = x-count;
            while((x%2==0 ||  x%3==0 ||  x%5==0)){
                count2++;
                x--;
            }
            if(count<count2){
                System.out.println(count);
            }
            else{
                System.out.println(count2);
            }
        }
    }
}
