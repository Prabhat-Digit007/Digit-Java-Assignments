package DAY4.LinearSearch;

import java.util.Scanner;

public class SearchString {
    static int linearSearch(String[] arr,String str){
        for(int i=0;i<arr.length;i++){
            if (arr[i].equals(str)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of String Array : ");
        int n=sc.nextInt();
        String[] arr=new String[n+1];
        System.out.println("Enter the Strings");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.print("Enter String to Search : ");
        String str=sc.nextLine();
        System.out.println(linearSearch(arr,str));
    }
}
