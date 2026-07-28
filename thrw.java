import java.io.FileReader;
import java.io.IOException;
public class thrw
{
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("C:\\Users\\rajad\\OneDrive\\ドキュメント\\Reports\\5 subjects.txt");
            System.out.println("File is opened");
        }
        catch(IOException e)
        {
            System.out.println("FIle is not found");
        }
    }
}