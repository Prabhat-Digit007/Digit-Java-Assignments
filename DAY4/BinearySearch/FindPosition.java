package DAY4.BinearySearch;

public class FindPosition {

        public static int bs(int[] arr, int key) {
            int i = 0;
            int j = arr.length - 1;
            int ans = -1;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                if (arr[mid] == key) {
                    ans = mid+1;
                    break;
                } else if (arr[mid] > key) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int key = 7;
            int ans = bs(a, key);
            System.out.println("Index of "+key+" : " + ans);
        }
}

