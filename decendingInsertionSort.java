import java.util.Arrays;
import java.util.Scanner;
class decendingInsertionSort {
    //Write your code here
   public static void insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++) {
        int valueToSort = arr[i];
        int j = i;
        while (j > 0 && arr[j-1]<valueToSort) {
            arr[j] = arr[j-1];
            j = j - 1;

        }
            arr[j] = valueToSort;

       }
    }
    public static void printArray(int[] B) {
      for(int i=0;i<B.length;i++)
          System.out.println(B[i]);
    }
    public static void main(String[] args) {
        //stem.out.println("Enter the no. of Iterations :");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int i = 0;
        int[] arr = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        insertionSort(arr);
        printArray(arr);
    }
}
