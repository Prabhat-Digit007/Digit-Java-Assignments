import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Values : ");

        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        duplicateCheck(arr,size);

    }

    private static void duplicateCheck(int[] arr, int size) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;++i){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println("Duplicate Element : ");
        for(HashMap.Entry<Integer,Integer>mp:map.entrySet()){
            if(mp.getValue()>1){
                System.out.println(mp.getKey());
            }
        }
    }


}
