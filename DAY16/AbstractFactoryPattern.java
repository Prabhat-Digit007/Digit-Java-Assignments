interface UserInterface {
    String Button();
    String TextFields();

}
class LightMode implements UserInterface {
    @Override
    public String Button() {
        return "Your Buttons have changed to Light Theme Buttons :)";
    }
    @Override
    public String TextFields() {
        return "Text Fields changed to Light Theme :)";
    }
}
class DarkMode implements UserInterface {
    @Override
    public String Button() {
        return "Your Buttons have changed to Dark Theme Buttons :)";
    }
    @Override
    public String TextFields() {
        return "Text Fields changed to Light Theme :)";
    }
}

abstract class UserInterfaceFactory{
    abstract UserInterface createFactory();
    public void getDescription(){
        UserInterface userInterface = createFactory();
        System.out.println(userInterface.Button());
        System.out.println(userInterface.TextFields());
    }

}
class LightModeFactory extends UserInterfaceFactory{
    @Override
    UserInterface createFactory() {
        return new LightMode();
    }

}
class DarkModeFactory extends UserInterfaceFactory{

    @Override
    UserInterface createFactory() {
        return new DarkMode();
    }
}

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        UserInterfaceFactory lightMode = new LightModeFactory();
        lightMode.getDescription();
        UserInterfaceFactory darkMode = new DarkModeFactory();
        darkMode.getDescription();
    }
}
