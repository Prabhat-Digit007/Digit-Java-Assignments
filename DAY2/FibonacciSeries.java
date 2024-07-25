import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String ars[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int size=scanner.nextInt();
        System.out.println("The sum : "+ generateFibonacci(size));


    }

    private static int generateFibonacci(int size) {
        int a=0,b=1,c;
        if(size==0){
            return a;
        }
        if(size==1){
            return b;
        }
        for(int i=2;i<=size;++i){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
        return b;
    }
}
