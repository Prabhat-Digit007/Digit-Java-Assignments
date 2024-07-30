package Workshop;

import java.util.HashMap;
//import java.util.HashSet;
//
//public class LongestConsecutiveSubsequence {
//    int a[] = {2,3,1,3,4,2,1};
//    HashSet set = new HashSet<>();
//
//}

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static int findLongestConsecutive(int[] arr) {


        int length = 1;
        int maxi = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                length++;
            }else length = 1;
            maxi = Math.max(maxi, length);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {11, 4, 13, 1, 3, 2, 5, 7, 8, 9};
        Arrays.sort(arr);
        int ans = findLongestConsecutive(arr);
        System.out.println(ans);
    }
}
