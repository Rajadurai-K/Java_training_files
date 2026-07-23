public class arrcountnum {
    public static void main(String[] args)
    {
        int[] num = {1,2,3,-4,5,-55};
        int count = 0;
        int countt = 0;
        for(int i = 0;i< num.length;i++)
        {
            if(num[i]>0)
            {
                System.out.println(num[i]);
                count++;
            }
            else if(num[i]<0){
                System.out.println(num[i]);
                countt++;
            }
        }
         System.out.println( "postive count : "+count);
        System.out.println( "negative count : "+countt);
    }
}
