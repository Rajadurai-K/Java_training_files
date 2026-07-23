//without parameter without return type
// class method {
//     static void greet()
//     {
//         System.out.println("welcome");
//     }
//     public static void main(String[] args)
//     {
//         greet();
//     }
// }

//parameter without return type

// class method
// {
//     static void ad(int a,int b)
//     {
//         System.out.println(a+b);
//     }
//     static void su(int a,int b)
//     {
//         System.out.println(a-b);
//     }
//     static void mu(int a,int b)
//     {
//         System.out.println(a*b);
//     }
//     public static void main(String[] args)
//     {
//         ad(10,20);
//         su(20,10);
//         mu(10,30);
//     }
// }

//without parameter with return type

// class demom
// {
//     static int get()
//     {
//         return 100;
//     }
//     public static void main(String[] args)
//     {
//         int num = get();
//         System.out.println(num);
//     }
// }

//parameter with return type

class method
{
    static int get(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        System.out.println(get(10,20));
    }
}