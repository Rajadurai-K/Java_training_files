import java.util.Scanner;
class Stu
{
    private int marks;
    public void setmar(int marks)
    {
        
        if(marks > 0 && marks <100)
        {
            this.marks = marks;
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    public int getmar()
    {
        return marks; 
    }

}

public class stuinf {
    public static void main(String[] args)
    {
        Stu s = new Stu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        s.setmar(sc.nextInt());
        int ss = s.getmar();
        System.out.print("Marks : ");
        System.out.println(ss);
    }
    
}
