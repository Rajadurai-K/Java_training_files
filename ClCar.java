import java.util.Scanner;
class Car
{
    Scanner sc  =new Scanner(System.in);
    void display()
    {
    System.out.println("Enter the car name :");
    String name = sc.nextLine();
    
    System.out.println("Enter the car model name :");
    String mname = sc.nextLine();
    
    System.out.println("Enter the car brand name :");
    String bname = sc.nextLine();
    System.out.println(" Car model name :"+mname);
    System.out.println(" Car name :"+name);
    System.out.println(" Car brand name :"+bname);
    }
}
public class ClCar {
    public static void main(String[] args)
    {
        Car c = new Car();
        c.display();
    }
    
}
