import java.util.Scanner;
public class swapcountBubbleSort {
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length-1;

        int totalSwaps = 0;
        //Write your code here
        for(int i = 0;i < size;i++){
            int var = 0;
            for(int j=0;j<size-i;j++){

                if (array[j] < array[j+1]) {

                    var++;totalSwaps++;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j] = temp;

                }

            }
           if(var==M){break;
           }
            /**if(var ==1)
                totalSwaps++;
            else
                break;*/
        }
        return totalSwaps;
    }

    public static void main(String[] args) {
        //stem.out.println("Enter the no. of Iterations :");
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
      //System.out.println("Enter the no. of Elements :");
        int n = input.nextInt();
        int i = 0;
        int[] arr = new int[n];
      //stem.out.println("Enter the elements of the array :");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
      //stem.out.println("The total number of swaps :"+totalBubbleSortSwaps(arr,M));
    }
}
