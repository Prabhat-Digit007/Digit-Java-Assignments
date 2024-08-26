package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class MyComprator implements Comparator<Integer>{
    public int compare(Integer l1,Integer l2){
        if(l1<l2) return +1;
        else if(l1>l2) return -1;
        else return 0;
    }
}



public class CompratorFunctionalLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        arr.sort(new MyComprator());
        System.out.println(arr);
    }
}
