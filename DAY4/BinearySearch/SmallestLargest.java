package DAY4.BinearySearch;

public class SmallestLargest {
        public static int findSmallestGreaterOrEqual(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return (left < arr.length) ? arr[left] : -1;
        }

        public static int findLargestLessOrEqual(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return (right >= 0) ? arr[right] : -1;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11};
            int target = 6;

            int smallestGreaterOrEqual = findSmallestGreaterOrEqual(arr, target);
            int largestLessOrEqual = findLargestLessOrEqual(arr, target);

            System.out.println("Smallest element >= " + target + ": " + smallestGreaterOrEqual);
            System.out.println("Largest element <= " + target + ": " + largestLessOrEqual);
        }
    }

