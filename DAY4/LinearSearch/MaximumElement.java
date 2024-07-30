package DAY4.LinearSearch;

import java.util.Scanner;

public class MaximumElement {
    public static int maxi(int []arr, int size){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            ans=Math.max(arr[i],ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scn.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++) {
            arr[i] = scn.nextInt();
        }
        int ans= maxi(arr,size);
        System.out.println("Maximum element is  " +ans);
    }
}
