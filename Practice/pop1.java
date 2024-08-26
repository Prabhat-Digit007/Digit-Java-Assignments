package Practice;

import java.util.ArrayList;
import java.util.function.Consumer;

    public class pop1 {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(9);
            numbers.add(8);
            numbers.add(1);

            // Using Consumer interface to store a lambda expression
            Consumer<Integer> method = (n) -> {
                System.out.println(n);
            };
            numbers.forEach(method);
        }
    }

