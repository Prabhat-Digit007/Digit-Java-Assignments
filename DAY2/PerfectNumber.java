import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){

        System.out.println("Enter a number to find if it is a perfect Number or not :");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();

        if(isPerfectNumber(number)){
            System.out.println(number+" is a perfect Number ");
        }
        else{
            System.out.println(number+" is not a perfect Number");
        }
    }

    private static boolean isPerfectNumber(int number) {
        int sum=0;
        for(int i=1;i<= number/2;++i){
            if(number%i==0){
                sum+=i;
            }
        }
        return (sum==number);
    }
}
