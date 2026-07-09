import java.util.Scanner;
public class swi {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the word");
       String x = sc.next();
       switch(x)
       {
        case "a", "A":
            {
                System.out.println("vowel");
                break;
            }
        case "e":
            {
                System.out.println("vowel");
                break;
            }
        case "i":
            {
                System.out.println("vowel");
                break;
            }
        case "o":
            {
                System.out.println("vowel");
                break;
            }
        case "u":
            {
                System.out.println("vowel");
                break;
            }
        default:

        {
            System.out.println("others word");
        }
       }
       
    }
    
}
