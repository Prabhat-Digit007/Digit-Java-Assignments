import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();

        if(num%5==0 && num%7 ==0){
            System.out.println("Check passed ");
        }
        else{
            System.out.println("Check Failed");
        }
    }
}
