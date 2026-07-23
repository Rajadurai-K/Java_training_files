public class arrsum {
    public static void main(String[] args)
    {
        int[] num = {10,20,30,40,50};
        System.out.println("sum of elemamts");
        int sum = 0;
        int ave = 0;
        for(int i =0;i<num.length;i++)
        {
         sum= sum + num[i];
        }
        System.out.println("sum of numbers : "+sum);
        ave = sum /(num.length);
        System.out.println("Average value : "+ave);

    }
}
