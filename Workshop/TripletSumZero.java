package Workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {
    public static void main(String[] args) {
        List<List<Integer>> triplets = new ArrayList<>();
        int arr[] = {2, -1, -1, 2, 0, 0, 0};

        for (int i = 0; i < arr.length - 2; i++) {
            int j = i+1;
            int k = j+1;
                if(arr[i]+arr[j]+arr[k] == 0){
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    triplets.add(triplet);
                }
        }

        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
