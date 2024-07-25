import java.util.Scanner;

public class MinimumOf2Number {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();
        System.out.println("Enter another number : ");
        int num1= scanner.nextInt();

        int result=(num<num1)?num:num1;
        System.out.println("Mimimun number :"+result);

    }
}
