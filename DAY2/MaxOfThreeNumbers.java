import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter three Numbers : ");
        int a,b,c;
        System.out.println("Enter a : ");
        a=scanner.nextInt();
        System.out.println("Enter b : ");
        b=scanner.nextInt();
        System.out.println("Enter c : ");
        c=scanner.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is greater than "+b+" and "+c);
            }
            else{
                System.out.println(c+" is greater than "+a+" and "+b);
            }

        }
        else{
            if(b>c){
                System.out.println(b+" is greater than "+a+" and "+c);
            }
        }

    }


}
