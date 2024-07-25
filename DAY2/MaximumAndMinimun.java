import java.util.Scanner;

public class MaximumAndMinimun {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Values : ");

        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        int maximum = arr[0];
        int minimum = arr[0];


        for(int i=1;i<size;++i){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }

        System.out.println("Maximum :" + maximum);
        System.out.println("Minimum :" + minimum);

    }
}
