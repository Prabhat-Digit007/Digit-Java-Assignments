package DAY7;

import java.util.Scanner;

public class four {
    public static class NegativeNumberException extends Exception{
        public NegativeNumberException(String e){
            super(e);
        }
    }
    public static void main(String[] args) throws NegativeNumberException{
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter a number : ");

            int num = scanner.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("Number is negative ");
            } else {
                System.out.println("The Number is : " + num);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
