import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();

        if(checkPrime(num)){
            System.out.println(num+" Is not a prime number ");
        }
        else{
            System.out.println(num+" Is a prime number ");
        }


    }

    private static boolean checkPrime(int num) {
        for(int i=2;i<Math.sqrt(num);++i){
            if(num%i==0){
                return true;
            }
        }
        return false;
    }

}
