import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringAnagram {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st String : ");
        String value1= scanner.next();
        System.out.println("Enter 2nd String : ");
        String value2= scanner.next();

        if(value1.length()==value2.length()) {
            System.out.println(check(value1, value2));
        }
        else{
            System.out.println("False");
        }

    }

    private static boolean check(String value1, String value2) {

        TreeMap<Character,Integer> map = new TreeMap<>();
        valueInsideMap(map,value1);

        return iterate(map,value2);


    }

    private static boolean iterate(TreeMap<Character, Integer> map, String value2) {

        for(int i=0;i<value2.length();++i){
            if(map.containsKey(value2.charAt(i))){
                map.put(value2.charAt(i),map.get(value2.charAt(i))-1);
                if(map.get(value2.charAt(i))==0){
                    map.remove(value2.charAt(i));
                }
            }
        }
        return map.isEmpty();
    }

    private static void valueInsideMap(TreeMap<Character, Integer> map,String value) {
        for(int i=0;i<value.length();++i){
            if(map.containsKey(value.charAt(i))){
                map.put(value.charAt(i),map.get(value.charAt(i))+1);
            }
            else{
                map.put(value.charAt(i),1);
            }
        }
    }
}
