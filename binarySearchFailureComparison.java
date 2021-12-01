import java.util.*;
class Source {
   private static int comparison=0;
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here

        //int left = 0;
        //int right = inputArr.length - 1;
        int mid = inputArr.length/ 2;

        if (inputArr.length == 0 )
            comparison++;


        if (inputArr[mid] < key) {
            comparison++;
           int subarray[] = Arrays.copyOfRange(inputArr, mid,inputArr.length);
            return getBinarySearchUnsuccessfulComparisonCount(subarray,key);


        } else if (inputArr[mid] > key) {
            comparison++;
            //right = mid;
            int subarray[] = Arrays.copyOfRange(inputArr,0, mid);
            return getBinarySearchUnsuccessfulComparisonCount(subarray,key);

        } else if (inputArr[mid] == key)
            comparison++;

         //System.out.println(comparison);
        return comparison-1;
}


    public static void main(String args[] ) throws Exception {
        Source bs = new Source();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();

        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));

    }
}
