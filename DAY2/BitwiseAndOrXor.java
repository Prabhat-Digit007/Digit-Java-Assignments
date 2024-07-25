import java.util.Scanner;

public class BitwiseAndOrXor {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();

        System.out.println("Enter another number : ");
        int num1= scanner.nextInt();

        System.out.println("AND : " +(num&num1));
        System.out.println("OR : "+(num|num1));
        System.out.println("XOR : "+(num^num1));
    }
}
