public class methodload {
    static void add(int a, int b)
    {
        System.out.println("Sum of two numbers : "+(a+b));
    }    
    static void add(int a, int b,int c)
    {
        System.out.println("Sum of two numbers : "+(a+b+c));
    }    
    public static void main(String[] args)
    {
        add(10,20);
        add(10,20,20);
    }
}
