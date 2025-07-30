package reverseArray;

public class reverse_Array {

    // Method to reverse the array
    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];    // save arr[start]
            arr[start] = arr[end];    // copy arr[end] to arr[start]
            arr[end] = temp;          // copy saved value to arr[end]
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 9, 6, 7, 288};
        int start = 0;
        int end = arr.length - 1;

        // Call reverse method
        reverseArray(arr, start, end);

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
