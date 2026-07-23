import java.util.Scanner;
public class strig {
    public static void main(String[] args)
    {
        System.out.println("Enter the StringValue");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        for(int i =0;i<in.length();i++)
        {
            char ch = in.charAt(i);
        }
        System.out.println(in.charAt(0));
        System.out.println(in.charAt(in.length()-1));
        
    }
}
