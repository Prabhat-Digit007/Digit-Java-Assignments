package DAY8;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(System.in)){
            int num=12/0;
            String a=null;

        }
        catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
