import java.util.Scanner; 
public class fac {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i =1;
        int s = 1;
        if(n!=0)
        {
            while(i<=n)
            {
                s=s*i;
                i++;
            }
            System.out.println(s);
        }
    }
}
