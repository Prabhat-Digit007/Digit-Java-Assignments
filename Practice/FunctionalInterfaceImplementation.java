package Practice;

public class FunctionalInterfaceImplementation {
    public static void main(String[] args) {
        spell s1 = () -> {
            System.out.println("This is my fuctional interface");
        };
        s1.spellPower();
    }
}
