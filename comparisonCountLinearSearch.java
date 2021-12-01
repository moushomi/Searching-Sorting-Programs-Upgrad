import java.util.Scanner;

public class comparisonCountLinearSearch {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        boolean found =false;
        int numberOfComparison= 0;
        int index = 0;

        //loop which breaks if number found or all numbers checked
        for(int i=0;i<inputArr.length;i++){
            if(inputArr[i]!=key)
                numberOfComparison++;
            else if(inputArr[i]==key)
                break;
        }
      return numberOfComparison;
    }
    public static void main(String args[] ) throws Exception {
        comparisonCountLinearSearch bs = new comparisonCountLinearSearch();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();

        System.out.println(bs.getLinearSearchUnsuccessfulComparisonCount(array, key));

    }
}
