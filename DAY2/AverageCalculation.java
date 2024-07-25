import java.util.Scanner;

public class AverageCalculation {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int arr[]= new int[5];
        int sum=0;

        System.out.println("Enter Five integers : ");
        for(int i=0;i<5;++i){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("The average of the numbers are : "+ sum/5);
    }
}
