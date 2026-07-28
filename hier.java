import java.util.Scanner;
class common
{
    public int num;
    private String name;
    void c(int num,String name)
    {
        this.num = num;
        this.name = name;
    }
    void display()
    {
        System.out.println("Account number : "+num);
        System.out.println("Customer name : "+name);
    }
}
class savem extends common
{
    void displayy()
    {
        System.out.println("Savings account balance :" +num);
    }
}
class curr extends common
{
    void displayyy()
    {
        System.out.println("current account balance :" +num);
    }
}
public class hier {
    public static void main(String[] args)

    {
        Scanner i = new Scanner(System.in);
        savem s = new savem();
        curr cc = new curr();
        System.out.println("Enter the Account number and customer name : ");
        s.c(i.nextInt(),i.nextLine());
        s.display();
        s.displayy();
        System.out.println("Enter the Account number and customer name : ");
        cc.c(i.nextInt(),i.nextLine());
        cc.display();
        cc.displayyy();
    }
}
