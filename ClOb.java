class Empl
{
    int empnum;
    String empname;
    void display()
    {
        System.out.println("Employee Number : "+empnum);
        System.out.println("Employee Name : "+empname);
    }
}
public class ClOb {
    public static void main(String[] args)
    {
        Empl sm = new Empl();
        sm.empnum = 15;
        sm.empname = "java";
        sm.display();
    }
}
