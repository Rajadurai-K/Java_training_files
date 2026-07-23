public class sumofsubarray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4} ;
        int count = 0 ;
        for(int st = 0; st<arr.length;st++)
            {
                for(int end = st;end<arr.length;end++)
                {   
                    int sum = 0;
                    
                    for(int i =st;i<=end;i++)
                    {
                        System.out.println(arr[i] +" ");
                        sum =sum+arr[i];
                    }
                    
                    System.out.println(" =  "+sum);
                    
                     if(sum==2){
                            count++;
                        }
                    System.out.println();
                       
                }
            }
            System.out.println("count of 2 is "+count );
    }
}
