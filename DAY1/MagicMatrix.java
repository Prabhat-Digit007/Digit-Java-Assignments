package DAY1;

import java.util.Scanner;

public class MagicMatrix {

    public static void main(String[] args){
        int[][] a;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimension of array");
        int n = sc.nextInt();
        System.out.println("Enter the sum to be found");
        int find = sc.nextInt();
        System.out.println("Enter matrix");
        a = new int[n][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int i=0;
        while(check && i<a.length){
            int sum = 0;
            for(int j=0;j<a.length;j++){
                sum += a[i][j];
            }
            if(sum!=15) check = false;
            i++;
        }


        int k=0;
        while(check && k< a.length){
            int sum = 0;
            for(int q=0;q< a.length;q++){
                sum += a[q][k];
            }
            if(sum!=15) check = false;
            k++;
        }

        int r=0;
        while(check && r<a.length){
            int sum = 0;
            for(r=0;r< a.length;r++){
                sum+=a[r][r];
            }
            if(sum!=15) check=false;
        }

        int l=2;
        while(check && l>=0){
            int sum = 0;
            for(l=a.length-1;l>=0;l--){
                sum+=a[l][l];
            }
            if(sum!=15) check=false;
        }

        System.out.println(check);
    }

}

//2 7 6 9 5 1 4 3 8