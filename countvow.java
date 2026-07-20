public class countvow {
    public static void main(String[] args)
    {
    String str = "Java programming";
    int count = 0;
    str= str.toLowerCase();
    for(int i =0;i<str.length();i++)
    {
        char c = str.charAt(i);
    
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
    {
        count++;
    }
    }
    System.out.println("Number of vowels " +count);
    }
}
