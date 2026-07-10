import java.util.Scanner;
public class wateer {
    public static void main(String[] args)
    {
        double water = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=8;i++)
        {
            System.out.println("Enter the amount of water (in ml)");
            double mea = sc.nextDouble();
            water = water + mea;
        }
        double l = water/1000;
        System.out.println("Total number of water consumed : "+l+" l");
    }
}
