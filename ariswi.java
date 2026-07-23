import java.util.Scanner;
public class ariswi {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int first  = sc.nextInt();
         System.out.println("enter the last number:");
        int last  = sc.nextInt();
         System.out.println("enter the Symbol + || - || * || / || % || :");
        String n = sc.next();
        switch(n)
        {
            case "+":
                {
                    int add = first + last ;
                    System.out.println(add);
                    break;
                }
            case "-":
                {
                    int sub = first - last ;
                    System.out.println(sub);
                    break;
                }
            case "*":
                {
                    int mul = first * last ;
                    System.out.println(mul);
                    break;
                }
            case "/":
                {
                    int div = first / last ;
                    System.out.println(div);
                    break;
                }
            case "%":
                {
                    int mod = first % last ;
                    System.out.println(mod);
                    break;
                }
            default:
                {
                    System.out.println("NUll");
                    break;
                }
        }
    }
}
