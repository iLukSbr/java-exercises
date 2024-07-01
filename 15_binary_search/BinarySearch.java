import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int element, int start, int end) {
        if (array == null || array.length == 0 || start > end) {
            return -1; // Return -1 if the array is null or empty or if start is greater than end
        }

        int middle = (start + end) / 2;

        if (array[middle] == element) {
            return middle;
        } else if (array[middle] < element) {
            return binarySearch(array, element, middle + 1, end);
        } else {
            return binarySearch(array, element, start, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 8, 6, 4, 1, 9, 3, 5, 7}; // Unsorted array
        int element = 6;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Searching element: " + element);
        
        Arrays.sort(array); // Sort the array

        System.out.println("Sorted array: " + Arrays.toString(array));

        int result = binarySearch(array, element, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Element found at ordered position " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}