import java.util.Scanner;

public class ArrayMerging {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the 1st  array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the size of the 2nd  array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter the Values of 1st array : ");
        insertValue(arr,size,scanner);

        System.out.println("Enter the Values of 2nd array : ");
        insertValue(arr1,size1,scanner);

        mergeArray(arr,arr1);


    }

    private static void mergeArray(int[] arr, int[] arr1) {
        int sortedAndMergedArray[]= new int[arr.length+arr1.length];
        int i=0,j=0,k=0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]<arr1[j]){
                sortedAndMergedArray[k]=arr[i];
                i++;
            }
            else{
                sortedAndMergedArray[k]=arr1[j];
                j++;
            }
            k++;
        }
        while(i<arr.length){
            sortedAndMergedArray[k]=arr[i];
            k++;i++;
        }
        while(j<arr1.length){
            sortedAndMergedArray[k]=arr1[j];
            k++;j++;
        }

        display(sortedAndMergedArray);
    }

    private static void display(int[] sortedAndMergedArray) {
        for(int arr:sortedAndMergedArray){
            System.out.print(arr+" ");
        }
    }

    private static void insertValue(int[] arr, int size,Scanner scanner) {
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
    }
}
