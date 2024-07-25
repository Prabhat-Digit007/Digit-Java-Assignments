import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponCollector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of distinct coupon numbers: ");
        int n = scanner.nextInt();

        int totalRandomNumbers = collectCoupons(n);
        System.out.println("Total random numbers needed to collect all distinct coupons: " + totalRandomNumbers);
    }

    public static int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    // Method to collect all distinct coupons
    public static int collectCoupons(int n) {
        HashSet<Integer> collectedCoupons = new HashSet<>();
        int totalRandomNumbers = 0;

        while (collectedCoupons.size() < n) {
            int newCoupon = generateRandomNumber(n);
            collectedCoupons.add(newCoupon);
            totalRandomNumbers++;
        }

        return totalRandomNumbers;
    }
}