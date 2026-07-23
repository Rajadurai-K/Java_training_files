import java.util.Scanner;
public class methodbank {
    static void deposit(double dep,double count)
    {
        count = count + dep;
    }
    
    static void with(double balance,double withdraw)
    {
        if(withdraw<=balance)
        {
            balance =  balance - withdraw;
            
        }
        else
        {
            System.out.println("in sufficemt");
        }
    }
    static void bal(double balance)
    {
        System.out.println("After transactions : "+balance);
    }
    public static void main(String[] args)
    {
        double count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Deposit amount :");
        double dep =sc.nextDouble();
        deposit(dep,count);
        System.out.println("Enter the withdraw amount :");
        double withdraw =sc.nextDouble();
        System.out.println("Enter the Balance amount :");
        double balance =sc.nextDouble();
        with(balance,withdraw);
        bal(balance);
        
        
        
        
    }
}




// import java.util.Scanner;


// public class methodbank {

//     static double balance = 0;

//     static void deposit(double dep, double count) {
//         balance = count + dep;
//     }

//     static void with(double balance1, double withdraw) {
//         if (withdraw <= balance1) {
//             balance = balance1 - withdraw;
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }

//     static void bal() {
//         System.out.println("After transactions : " + balance);
//     }

//     public static void main(String[] args) {
//         double count = 0;

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Deposit amount :");
//         double dep = sc.nextDouble();
//         deposit(dep, count);

//         System.out.println("Enter the withdraw amount :");
//         double withdraw = sc.nextDouble();

//         System.out.println("Enter the Balance amount :");
//         balance = sc.nextDouble();

//         with(balance, withdraw);

//         bal();
//     }
// }