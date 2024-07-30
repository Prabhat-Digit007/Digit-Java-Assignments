package DAY4.BinearySearch;

public class FirstAndLastOccurence {
    public static int bsFirst(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == key) {
                while(arr[mid-1]==key){
                    mid--;
                    ans = mid;
                }
                break;
            } else if (arr[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }
    public static int bsLast(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == key) {
                while(arr[mid]+1==key) mid++;
                ans = mid;
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
        int[] a = {1, 1, 1, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 2;
        int first = bsFirst(a, key);
        int last = bsLast(a, key);
        System.out.println(first);
        System.out.println(last);
    }
}
