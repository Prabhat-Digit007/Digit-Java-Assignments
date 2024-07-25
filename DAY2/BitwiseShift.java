import java.util.Scanner;

public class BitwiseShift {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();

        System.out.println("Multiplies by using left shift operator" +(num<<2));
        System.out.println("Multiplies by using right shift operator" +(num>>2));
    }
}
