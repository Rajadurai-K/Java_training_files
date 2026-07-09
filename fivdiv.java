import java.util.Scanner;
class Five
{
    public static void main(String[] args)
    {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = f.nextInt();
        if(num % 5==0)
        {
            System.out.println("Divisible by 5 ");
        }
        else
        {
            System.out.println("Not divisibe by 5");
        }
    }
}