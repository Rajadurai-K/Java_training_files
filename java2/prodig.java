import java.util.Scanner;
public class prodig {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits :");
        int num = sc.nextInt();
        int i = 1;
        int p = 1;
        int r = 0;
     
        if(num!=0)
            {
                while(i<=num)
                {
                    r = num%10;
                    p = p*r;
                    num = num/10;

                }
                 System.out.println(p);
            } 
       
    }
}
