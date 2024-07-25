import java.util.Scanner;

public class StopWatch {
    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter to start the stopwatch : ");
        scanner.nextLine();
        long start = System.currentTimeMillis();

        System.out.println("Enter to End the stopwatch : ");
        scanner.nextLine();
        long end= System.currentTimeMillis();

        System.out.println("The Duration between the Start And End is : "+(end-start));
    }
}
