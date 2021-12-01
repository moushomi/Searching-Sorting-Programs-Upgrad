import java.util.Scanner;

class insertionStringSort {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        //Write your code here
       sort_firstnames(firstNames,size);


        sort_lastnames(lastNames,size);

    }

    public static void sort_firstnames(String array[],int f){
        String temp = "";
        for(int i = 1;i<f;i++){
            String key = array[i];
              int j = i-1;
            while(j>=0){
                if(key.compareTo(array[j])>0){
                    break;
                }
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;

        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }


    public static void sort_lastnames(String array[],int f){
        String temp = "";
        for(int i = 1;i<f;i++){
            String key = array[i];
            int j = i-1;
            while(j>=0){
                if(key.compareTo(array[j])<0){
                    break;
                }
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
         }

        for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }

}