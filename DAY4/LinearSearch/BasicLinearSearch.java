package DAY4.LinearSearch;

import java.util.Scanner;

public class BasicLinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter value at index : " + i );
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value you want to find in an Array");
        int key = sc.nextInt();
        int ans = -1;
        for (int i=0;i<n;i++){
            if(a[i]==key){
                System.out.println("Value" +key +" find at index : " + i);
                ans = i;
            }
        }
        if(ans==-1) System.out.println("-1");
    }


}
