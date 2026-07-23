public class linear {
    public static void main(String[] args)
    {
        int[] num = {1,2,3,4,5,55,55,5,5,5};
        int key =5;
        int count = 0;
        for(int i = 0;i< num.length;i++)
        {
            if(num[i]==key)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(key+" appear in "+count+" times");
        }
        else{
            System.out.println("invalid number");
        }
    }
}
