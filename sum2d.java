public class sum2d {
    public static void main(String[] args)
    {
        int[][] arr = {
            {1,2,3},
            {5,6,7},
            {8,9,0}
        };
        int sum = 0;
        System.out.println("Matrix: ");
        for(int i = 0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum =sum+arr[i][j];
                
            }
            System.out.println();
        }
        System.out.println("Sum = "+sum);
    }
}
