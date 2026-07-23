import java.util.Scanner;

public class decode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the encoded message:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '.') {
                System.out.print(" ");
            }
            else if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char)(ch + 2));
            }
            else if (ch >= 'a' && ch <= 'z') {
                System.out.print((char)(ch + 2));
            }
            else {
                System.out.print(ch);
            }
        }
    }
}