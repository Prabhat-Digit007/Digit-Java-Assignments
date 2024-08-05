package DAY9;

public class Rethrowing {
    public static void main(String[] args) {
        int numerator = 12;
        int denominator = 0;

        try {
            calculate(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error -> "+e.getMessage());
        }

    }

    private static void calculate(int numerator, int denominator) {
        try {
            performDivision(numerator, denominator);
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Failed to call performDivision : "+e.getMessage());
        }
    }

    private static void performDivision(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("denominator is zero . ");
        }
        System.out.println("The result : "+ numerator/denominator);
    }

}
