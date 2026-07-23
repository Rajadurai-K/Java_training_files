import java.util.Scanner;
class arrrprint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i= 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("array");
        for(int i= 0;i<arr.length;i++)
        {
            
            System.out.println(arr[i]);
        }
        
    }
}