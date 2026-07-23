 import java.util.Scanner;
 class Vig

{
    public static void main(String[] args)
    
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        if(num%2==0)
            {
                System.out.println("Its the even number");
            } 
        else
            {
                System.out.println("Its the odd number");
            }
    }
}