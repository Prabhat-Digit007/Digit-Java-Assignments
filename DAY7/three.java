package DAY7;

import java.util.Scanner;

public class three {

    public static class InvalidAgeException extends Exception{
        public InvalidAgeException(String e){
            super(e);
        }
    }
    public static void main(String[] args) throws InvalidAgeException {

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your age : ");
            int age = scanner.nextInt();
            if (age < 18 ) {
                throw new InvalidAgeException("Access Denied : Age < 18");
            }
            else {
                System.out.println("Access Granted : Age > 18");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
