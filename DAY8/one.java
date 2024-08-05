package DAY8;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {


        try(Scanner scanner= new Scanner(System.in)){
            System.out.println("Enter a number that would divide 100 .: ");
            int a=scanner.nextInt();
            int result=100/a;
            System.out.println(result);

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
