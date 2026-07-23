import java.util.Scanner;
public class evendo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the initial");
        int i = 2;
       if(i%2==0) {
        do{
            System.out.println(i);
             i++;
        }
        while(i<=n);
          } 
    }
}
