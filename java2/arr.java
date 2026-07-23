// class arr
// {
//     public static void main(String[] args)
//     {
//         int[] arr ={1,2,3,45,5};
//         for(int i =0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }
import java.util.Scanner;
class arr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}