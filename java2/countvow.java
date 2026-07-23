import java.util.Scanner;
public class countvow {
    public static void main(String[] args)
    {
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Enter the String values"); 
     int a =0;
    int e =0;
    int i =0;
    int o =0;
    int u =0;
    str= str.toLowerCase();
    for(int ii =0;ii<str.length();ii++)
    {
        char c = str.charAt(ii);
   
    if(c=='a')
    {
        a++;
    }
    if(c=='e')
    {
        e++;
    }
    if(c=='i')
    {
        i++;
    }
    if(c=='o')
    {
        o++;
    }
    if(c=='u')
    {
        u++;
    }
    }
    System.out.println("Number of a " +a);
    System.out.println("Number of e " +e);
    System.out.println("Number of i " +i);
    System.out.println("Number of o " +o);
    System.out.println("Number of u " +u);
    }
}
