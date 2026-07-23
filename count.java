import java.util.Scanner;
public class count {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits :");
        int n = sc.nextInt();
        int i = 1;
        if(n!=0)
        {
            while(i<=n)
            {
                i++;
            }
            System.out.println(i);
        }
    }
    
}
