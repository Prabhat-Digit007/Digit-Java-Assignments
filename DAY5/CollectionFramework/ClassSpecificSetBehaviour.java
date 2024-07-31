package DAY5.CollectionFramework;

import java.awt.print.PrinterGraphics;
import java.util.*;

public class ClassSpecificSetBehaviour {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,5,1,2));
        HashSet<Integer>hashSet = new HashSet<>();
        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
        TreeSet<Integer>treeSet = new TreeSet<>();

        hashset(hashSet,list);
        linked(linkedHashSet,list);
        tree(treeSet,list);

    }

    private static void tree(TreeSet<Integer> treeSet, List<Integer> list) {
        for(Integer a:list){
            treeSet.add(a);
        }
        Iterator<Integer> it= treeSet.iterator();
        System.out.print("\nTreeSet : ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    private static void linked(LinkedHashSet<Integer> linkedHashSet, List<Integer> list) {
        for(Integer a:list){
            linkedHashSet.add(a);
        }
        Iterator<Integer> it= linkedHashSet.iterator();
        System.out.print("\nLinkedHashSet : ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    private static void hashset(HashSet<Integer> hashSet, List<Integer> list) {
        for(Integer a:list){
            hashSet.add(a);
        }
        Iterator<Integer> it= hashSet.iterator();
        System.out.print("\nHashSet : ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }


}
