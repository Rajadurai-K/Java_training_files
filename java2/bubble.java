class bubble
{
    public static void main(String[] args)
    {
        int[] arr = {34,5,2222,66,333};
        for(int i =0 ;i<arr.length-1;i++)
        {
            for(int j=0 ;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] +" ");
        }
    }
}