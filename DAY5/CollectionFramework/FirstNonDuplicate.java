package DAY5.CollectionFramework;

import java.util.*;

public class FirstNonDuplicate {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,4,7,8,5));
        LinkedHashSet<Integer> lhs= new LinkedHashSet<>();

        nonDuplicate(list,lhs);
    }

    private static void nonDuplicate(List<Integer> list, LinkedHashSet<Integer> lhs) {
        for(Integer a:list){
            lhs.add(a);
        }
        Iterator<Integer> it = lhs.iterator();
        while(it.hasNext()){
            int count=0;
            int present=it.next();
            for(Integer a:list){
                if(present==a){
                    count++;
                }
            }
            if(count==1){
                System.out.println(present);
                break;
            }
        }
    }
}