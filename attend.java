import java.util.Scanner;
public class attend {
    public static void main(String[] args)
    {
        int present = 0;
        int absent = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i<=30;i++)
        {
        System.out.println("Enter the attendance (Present = 1 , Absent = 0): for 30 Students");
        int attend = sc.nextInt();
        if(attend == 1)
        {
            present++;
        }
        else if (attend == 0)
        {
            absent++;
        }
        }
         System.out.println("Total number of presents : "+present+"/30");
        System.out.println("Total number of absents : "+absent+"/30");
    }
}
