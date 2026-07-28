import java.util.*;
import java.util.Scanner;
class Person
{
    
    private String name;
    void name(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println("Student name : "+name);
    }

}
class Student extends Person
{
    private int roll_num;
    void number(int roll_num)
    {
        this.roll_num = roll_num;
    }
    void numbeer()
    {
        System.out.println("Student roll number : "+roll_num);
    }

}
class Graduate extends Student 
{
    private String Spe;
    void gra(String Spe)
    {
        this.Spe = Spe;
    }
    void ss()
    {
        System.out.println("Student Spe : "+Spe);
    }
}
class multilevel 
{
    public static void main(String[] args)
    { Scanner s = new Scanner(System.in);
        Graduate p = new Graduate();
        System.out.println("Enter the Student name : ");
        p.name(s.nextLine());
        System.out.println("Enter the Student roll number : ");
        p.number(s.nextInt());
        s.nextLine();
        System.out.println("Enter the Student Specifications : ");
        p.gra(s.nextLine());
        p.display();
        p.numbeer();
        p.ss();
    }
}