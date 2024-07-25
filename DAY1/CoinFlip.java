package DAY1;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args){
        System.out.println("Enter number of flips");
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        int head = 0;
        int tail = 0;
        while(flips-->0){
            Random RandomNumber = new Random();
            double probability = RandomNumber.nextInt();
            if(probability < 0.5)head++;
            else tail++;
        }
        System.out.println(head);
        System.out.println(tail);

        double headProbability = ((double) (head) /(head+tail))*100;
        double tailProbability = ((double) (tail) /(head+tail))*100;
        System.out.println(headProbability);
        System.out.println(tailProbability);

    }
}
