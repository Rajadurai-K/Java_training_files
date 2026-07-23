import java.util.Scanner;
public class arm {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Armstrong number :");
        int ori = sc.nextInt();
        int num = ori;
        int arm  = 0;

        while(num!=0)
        {
            int r = num%10;
            arm = arm +(r*r*r);
            num = num/10;
        }
        if(arm == ori)
        {
            System.out.println("Armstrong Numbers");
        }
        else
        {
            System.out.println("not Armstrong Numbers");
        }
    }
}
