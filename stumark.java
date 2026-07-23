
import java.util.Scanner;
class stumark 
{
    public static void main(String[] arge)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the student name :");
        String name = sc.next();
        System.out.println("Enter the subject mark one by one :");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        int average =  total/5;
        System.out.println("Total mark :"+total);
        System.out.println("Average mark :"+average);
        if (average>=90)
        {
            System.out.println("Grade A");
        }
        else if (average>=80)
        {
            System.out.println("Grade B");
        }
        else if (average>=70)
        {
            System.out.println("Grade C");
        }
        else if (average>=60)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("fail");
        }



    }
}