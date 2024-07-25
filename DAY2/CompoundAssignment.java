import java.util.Scanner;

public class CompoundAssignment {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();

        num+=12;
        System.out.println("use of  += by adding 12 : "+num);

        num-=12;
        System.out.println("use of  -= by subtracting 12 : "+num);

        num*=2;
        System.out.println("use of  *= by multiplying 2 : "+num);

        num/=2;
        System.out.println("use of  /= by dividing 2 : "+num);

        num%=2;
        System.out.println("use of  %= 2 : "+num);

    }
}
