import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCount {
    public static void main(String args[]){

        System.out.println("Enter your input : ");
        Scanner scanner= new Scanner(System.in);
        String input= scanner.next();

        InsertValue(input);

    }

    private static void InsertValue(String input) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<input.length();++i){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }
            else{
                map.put(input.charAt(i),1);
            }
        }

        traverse(map);
    }

    private static void traverse(HashMap<Character, Integer> map) {
        for(Map.Entry<Character,Integer>mp:map.entrySet()){
            System.out.println(mp.getKey()+ " : "+mp.getValue());
        }
    }

}
