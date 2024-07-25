import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the 1st matrix array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the size of the 2nd matrix array: ");
        int size1 = scanner.nextInt();

        if(size==size1){
            int[][] arr = new int[size][size];
            int[][] arr1 = new int[size][size];

            System.out.println("Enter the Values of 1st matrix: ");
            entervalues(arr,size,scanner);
            System.out.println("Enter the Values of 2nd matrix: ");
            entervalues(arr1,size,scanner);


            System.out.println("The addition are : ");
            addition(arr,arr1,size);
        }


    }

    private static void addition(int[][] arr, int[][] arr1, int size) {
        int addition[][]= new int[size][size];
        for(int i=0;i<size;++i){
            for(int j=0;j<size;++j){
                addition[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<size;++i){
            for(int j=0;j<size;++j){
                System.out.print(addition[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void entervalues(int[][] arr, int size,Scanner scanner) {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
    }

}
