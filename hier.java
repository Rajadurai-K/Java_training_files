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
        savem s = new savem();
        s.c(23,"java");
        s.display();
    }
}
