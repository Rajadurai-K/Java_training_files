public class RightRotate {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        // Store the last element
        int temp = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            
        }

        // Put the last element at the first position
        arr[0] = temp;

        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}