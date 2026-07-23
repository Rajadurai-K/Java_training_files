public class palinst {
    public static void main(String[] args)
    {
        char[] ch = {'j','a','v','a','j'};
        char[] sh= new char[ch.length];
        for(int i =ch.length-1;i>=0;i--)
        {
            // System.out.print(ch[i]);
            sh[i]=ch[i];;
            
        }
        if(sh==ch)
        {
            System.out.println("Palindrome");
        }
        else
        {
             System.out.println("not Palindrome");
        }
    }
}



// char is doent worked 