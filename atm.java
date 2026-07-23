import java.util.Scanner;
public class atm {
    public static void main(String[] args)

    {
        final int balance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        int amount  = sc.nextInt();
        if(amount< balance)
        {
            System.out.println("Sufficinet balance ");
        }
        else
        {
            System.out.println("insufficinet balance ");
        }

    }
    
}
