package Practice;

import java.util.ArrayList;

public class pop2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Using lambda expression in forEach() method
        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}
