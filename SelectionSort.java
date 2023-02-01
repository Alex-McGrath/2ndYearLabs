import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[]array = new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        sc.close();

        selectionSort(array);

        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int[]array){
        int n = array.length;
        //One by one move boundary of unsorted subarray
        for(int i =0;i<n-1;i++){
            //Find the minimum element in unsorted array
            int minIndex =i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }

            //swap the found minimum element with the first element 
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }
}
