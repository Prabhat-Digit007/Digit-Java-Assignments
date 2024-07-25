import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2=scanner.nextInt();

        System.out.println("The sum is : "+(num1+num2));
        System.out.println("The sum is : "+(num1-num2));
    }
}
