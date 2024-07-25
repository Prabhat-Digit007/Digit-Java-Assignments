import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        input(arr,scanner,size);

        System.out.println("Enter the position : ");
        int k= scanner.nextInt();

        swapping(arr,0,size-k);
        swapping(arr,size-k,size);
        swapping(arr,0,size);


        display(arr,size);

    }

    private static void display(int[] arr,int size) {
        for(int i=0;i<size;++i){
            System.out.print(arr[i]+" ");
        }
    }

    private static void swapping(int[] arr, int start, int end) {
        for(int i=0;i<(end-start)/2;++i){
            int temp=arr[start+i];
            arr[start+i]=arr[end-i-1];
            arr[end-i-1]=temp;

        }
    }

    public static void input(int []arr,Scanner scanner,int size){
        System.out.println("Enter the Values : ");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
    }


}
