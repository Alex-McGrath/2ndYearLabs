import java.util.*;
public class bubblesort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[]array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        bubbleSort(array);
        System.out.println("Sorted array:");
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] array){
        int n = array.length;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
