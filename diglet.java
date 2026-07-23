import java.util.Scanner;
public class diglet {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String s = sc.nextLine();
        int dig = 0;
        int let = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >='a'&&ch<='z')
            {
                let++;
            }
           else if(ch >='0'&&ch<='9')
            {
                dig++;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
            System.out.println("Alphabet number : "+let);
            System.out.println("Digits number : "+dig);
        
        
    }
}
