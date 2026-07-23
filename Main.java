
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int spaces = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '.') {
                spaces++;
            }
            else if(!Character.isLetterOrDigit(ch))
            {
                special++;
            }
        }

        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special);
    }
}