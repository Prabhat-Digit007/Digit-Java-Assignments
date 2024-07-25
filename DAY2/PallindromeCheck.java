import java.util.Scanner;

public class PallindromeCheck {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        String name= scanner.next();
        System.out.println(check(name));

    }

    private static boolean check(String name) {
        for(int i=0;i<name.length()/2;++i){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;
            }
        }return true;
    }
}
