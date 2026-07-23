public class maximumsubarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        for (int st = 0; st < arr.length; st++) {
            for (int end = st; end < arr.length; end++) {

                int sum = 0; // Reset sum for each subarray
                int mod = 0;

                for (int i = st; i <= end; i++) {
                    System.out.print(arr[i] + " \n");
                    sum = sum + arr[i];
                    mod = sum%2;

                }

                System.out.println("sum = " + sum);
                System.out.println("rem = " +mod);

            }
        }
    }
}