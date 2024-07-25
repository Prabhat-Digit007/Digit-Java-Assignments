package DAY1;

import java.util.Scanner;

public class Cyclic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rotnTime = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        while(rotnTime!=0){
            int temp = a[a.length-1];
            for(int i=a.length-2;i>=0;i--){
                if(i==0){
                    a[i+1] = a[i];
                    a[i] = temp;
                }
                else a[i+1]=a[i];
            }
            rotnTime--;
        }
        for(int i=0;i< a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

}
