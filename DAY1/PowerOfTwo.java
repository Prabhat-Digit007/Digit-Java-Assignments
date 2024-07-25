package DAY1;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = (int) Math.pow(2, n);
        int i = 2;
        System.out.println(i);
        while(i<power){
            i = i * i;
            System.out.println(i);

        }
    }
}
