package DAY4.LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class AllOcurences {
    public static ArrayList<Integer> count(int[]arr,int n){
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==n){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int key= scn.nextInt();
        System.out.println("Enter the size of the array");
        int size = scn.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans= count(arr,key);

        for (Integer an : ans) {
            System.out.println(an);
        }
    }

}